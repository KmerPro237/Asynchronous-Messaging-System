package QueueBasedMessaging.BeansQueue;

import java.io.Serializable;

public class Message implements Serializable {
        private static final long serialVersionUID = 1L;

        private String topic;
        private String content;

        public Message(String topic, String content) {
                this.topic = topic;
                this.content = content;
        }

        public String getTopic() {
                return topic;
        }

        public String getContent() {
                return content;
        }
}


