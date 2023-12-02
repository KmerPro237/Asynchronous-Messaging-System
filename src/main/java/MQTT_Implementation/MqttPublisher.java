package MQTT_Implementation;

import org.eclipse.paho.client.mqttv3.*;

public class MqttPublisher {

    public static void main(String[] args) {
        String broker = "tcp://mqtt.eclipse.org:1883"; // Öffentlicher MQTT-Broker für Testzwecke
        String clientId = "MqttPublisher";
        String topic = "test/topic";

        try {
            MqttClient client = new MqttClient(broker, clientId);
            MqttConnectOptions connOpts = new MqttConnectOptions();
            connOpts.setCleanSession(true);

            System.out.println("Connecting to broker: " + broker);
            client.connect(connOpts);
            System.out.println("Connected");

            String message = "Hello, MQTT!";
            MqttMessage mqttMessage = new MqttMessage(message.getBytes());
            client.publish(topic, mqttMessage);
            System.out.println("Message sent: " + message);

            client.disconnect();
            System.out.println("Disconnected");
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }
}

