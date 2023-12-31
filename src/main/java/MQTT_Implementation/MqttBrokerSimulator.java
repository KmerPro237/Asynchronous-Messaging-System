package MQTT_Implementation;

import org.eclipse.paho.client.mqttv3.*;

public class MqttBrokerSimulator {

    public static void main(String[] args) {
        String broker = "tcp://mqtt.eclipseprojects.io:1883"; // Öffentlicher MQTT-Broker für Testzwecke
        String clientId = "MqttBroker";

        try {
            MqttClient client = new MqttClient(broker, clientId);
            MqttConnectOptions connOpts = new MqttConnectOptions();
            connOpts.setCleanSession(true);

            System.out.println("Connecting to broker: " + broker);
            client.connect(connOpts);
            System.out.println("Broker connected");

            client.setCallback(new MqttCallback() {
                @Override
                public void connectionLost(Throwable cause) {
                    System.out.println("Connection lost");
                }

                @Override
                public void messageArrived(String topic, MqttMessage message) throws Exception {
                    System.out.println("Broker received message on topic '" + topic + "': " + new String(message.getPayload()));
                }

                @Override
                public void deliveryComplete(IMqttDeliveryToken token) {
                    // Wird aufgerufen, wenn die Nachricht erfolgreich zugestellt wurde
                }
            });

            // Simuliere mehrere Topics, die vom Broker überwacht werden

            /*while (true) {
                for (int i = 0; i < 100; i++) {
                    String topic = "test/topic/" + i;
                    System.out.println("Subscribing to topic: " + topic);
                    client.subscribe(topic);
                }
            }*/

            String[] topics = {"test/topic", "another/topic"};
            for (String topic : topics) {
                System.out.println("Subscribing to topic: " + topic);
                client.subscribe(topic);
            }

            // Warten, um Nachrichten zu empfangen
            Thread.sleep(1000000);

            client.disconnect();
            System.out.println("Broker disconnected");
        } catch (MqttException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

