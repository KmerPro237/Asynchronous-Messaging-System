package REST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/publish")
public class PublisherController {

    @Autowired
    private BrokerService brokerService;

    @PostMapping
    public ResponseEntity<Void> publishMessage(@RequestBody Message message) {
        brokerService.publish(message);
        return ResponseEntity.ok().build();
    }
}

