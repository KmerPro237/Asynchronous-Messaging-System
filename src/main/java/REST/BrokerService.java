package REST;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Service
public class BrokerService {

    private Map<String, Set<Subscriber>> subscriptions = new HashMap<>();

    public void publish(Message message) {
        String topic = message.getTopic();
        Set<Subscriber> subscribers = subscriptions.getOrDefault(topic, new HashSet<>());
        for (Subscriber subscriber : subscribers) {
            subscriber.notify(message);
        }
    }

    public void subscribe(SubscriptionRequest subscriptionRequest) {
        String topic = subscriptionRequest.getTopic();
        Subscriber subscriber = subscriptionRequest.getSubscriber();

        subscriptions.computeIfAbsent(topic, k -> new HashSet<>()).add(subscriber);
    }
}

