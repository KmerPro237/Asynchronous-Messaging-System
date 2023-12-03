package MQTT_Implementation;

import org.eclipse.paho.client.mqttv3.*;

public class MqttPublisher {

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            String broker = "tcp://mqtt.eclipseprojects.io:1883"; // Öffentlicher MQTT-Broker für Testzwecke
            String clientId = "MqttPublisher-" + i;
            String topic = "test/topic";

            try {
                MqttClient client = new MqttClient(broker, clientId, null);
                MqttConnectOptions connOpts = new MqttConnectOptions();
                connOpts.setCleanSession(true);

                System.out.println("Connecting to broker: " + broker);
                client.connect(connOpts);
                System.out.println("Connected");

                String message = "Hello, MQTT!";
                MqttMessage mqttMessage = new MqttMessage(message.getBytes());
                client.publish(topic, mqttMessage);
                System.out.println("Message sent: " + message);

                    message = "Hello, MQTT! \n I am still alive! Message sent from " + clientId;
                    mqttMessage = new MqttMessage(message.getBytes());
                    client.publish(topic, mqttMessage);
                    System.out.println("Message sent: " + message);


            } catch (MqttException e) {
                e.printStackTrace();
            }
        }
    }
}

