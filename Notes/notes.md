# Notes on Messaging protocols: AMQP, MQTT, STOMP, JMS, WebSockets

## Standard AMQP Messaging in RabbitMQ
![img.png](Images/img.png)
## Message reception, processing and delivery within a distributed Architecture

## Exchangers
- Exchangers are the entry point for messages into the system. They are responsible for receiving messages from the producers/publishers and routing them to the appropriate queues.
- Exchangers can be configured to route messages to queues based on a number of criteria, including:
  - The routing key of the message
  - The type of the message
  - Headers in the message
  - The source of the message
- They can also be classified into different types:
  
  - Direct Exchangers
    - Messages are routed to queues based on the routing key of the message. Routing keys are key-value pairs that are part of the message header. The routing key is matched against the binding key of the queue. If they match, the message is routed to the queue.
      ![img_1.png](Images/img_1.png)
  
  - Fanout Exchangers
      - Messages are routed to all the queues that are bound to the exchanger. The routing key is ignored in this case.
      ![img_3.png](Images/img_3.png)
  
  - Topic Exchangers
    - Here, the routing key follows a specific naming pattern using wildcards and conventions. When the adequate routing key is found, the message will be sent to the corresponding queue.
      ![img_2.png](Images/img_2.png)
  
  - Headers Exchangers
      - Messages are routed based on the headers in the message. The routing key is ignored in this case.
      ![img_4.png](Images/img_4.png)
  
  - Default Exchangers
    - Messages are routed to the queue with the same name as the routing key. If no such queue exists, the message is discarded. Every exchanger is bound to a default queue with the same name as the exchanger.
        
  - Dead Letter Exchangers
      - Messages that are not delivered to the queue within a specified time are sent to a dead letter queue. This is useful for debugging purposes.
  
## MQTT as another messaging protocol
- MQTT is a lightweight messaging protocol that is used in IoT applications. It is based on the publish-subscribe model.
- MQTT is based on the TCP/IP protocol and is designed for constrained devices and low-bandwidth, high-latency networks.
- MQTT uses a broker to route messages between publishers and subscribers. The broker is responsible for receiving messages from publishers and sending them to the subscribers.
- MQTT uses a topic-based publish-subscribe model. Publishers publish messages to a topic. Subscribers subscribe to a topic and receive messages from the broker.
- MQTT uses a QoS (Quality of Service) level to determine the reliability of message delivery. There are three levels of QoS:
  - QoS 0: At most once delivery
  - QoS 1: At least once delivery
  - QoS 2: Exactly once delivery
  
  ![img.png](Images/mqtt.png)
  
### Publish-Subscribe Characteristics
- Space decoupling
  - Publishers and subscribers are decoupled in space. They do not need to know about each other.

- Time decoupling (Queueing)
  - Publishers and subscribers are decoupled in time. They do not need to be active at the same time.

- Synchronization decoupling
  - Publishers and subscribers are decoupled in synchronization. They do not need to be active at the same time. Asynchronous communication is possible with APIs for example.
  - Synchronous vs asynchronous APIs
    - Synchronous API calls 
      ![img.png](Images/synchronousAPI.png)
    - Asynchronous API calls
      ![img_1.png](Images/AsynchronousAPI.png)

- Scalability
  - Publishers and subscribers can be scaled independently. Multiple broker instances can be clustered into a single instance to form a virtual broker which then scales the system.

- SPOF (Single Point of Failure)
  - The broker is a single point of failure. If the broker fails, the entire system fails. To avoid this, the broker can be clustered into a virtual broker.

### Example Commands for the System

#### Publisher
- publish --- (topic, message)

#### Subscriber
- subscribe --- (topic)
- unsubscribe --- (topic)
- aknowledge --- (messageId)
- getMessages --- (topic)

#### Admin-Client
- createTopic --- (topic)
- deleteTopic --- (topic)
- modifyTopic --- (topic, messageId, value)
- listTopics --- ()
- listSubscribers --- (topic)
- listPublishers --- (topic)
- listMessages --- (topic, subscriber)
- getClientStatus --- (clientId)
- monitorConnections --- (clientId)
- monitorTopics --- (topicId)
- configure --- (setting, value)

What will happen next?