package uz.blacknet.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MyKafkaListener
{
    @KafkaListener(
            topics = {"ok"},
            groupId = "groupId"
    )
    void listener(String topic, String message)
    {
        System.out.println("-> " + topic + ": " + message);
    }
}
