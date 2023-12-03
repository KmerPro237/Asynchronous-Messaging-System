package MQTT_Implementation;

import org.eclipse.paho.client.mqttv3.*;

public class MqttSubscriber {

    public static void main(String[] args) {
            String broker = "tcp://mqtt.eclipseprojects.io:1883"; // Öffentlicher MQTT-Broker für Testzwecke
        String clientId = "MqttSubscriber";
        String topic = "test/topic";

        try {
            MqttClient client = new MqttClient(broker, clientId);
            MqttConnectOptions connOpts = new MqttConnectOptions();
            connOpts.setCleanSession(true);

            System.out.println("Connecting to broker: " + broker);
            client.connect(connOpts);
            System.out.println("Connected");

            client.setCallback(new MqttCallback() {
                @Override
                public void connectionLost(Throwable cause) {
                    System.out.println("Connection lost");
                }

                @Override
                public void messageArrived(String topic, MqttMessage message) throws Exception {
                    System.out.println("Received message on topic '" + topic + "': " + new String(message.getPayload()));
                }

                @Override
                public void deliveryComplete(IMqttDeliveryToken token) {
                    // Wird aufgerufen, wenn die Nachricht erfolgreich zugestellt wurde
                }
            });

            System.out.println("Subscribing to topic: " + topic);
            client.subscribe(topic);

            Thread.sleep(50000);

            client.disconnect();
            System.out.println("Disconnected");
        } catch (MqttException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
