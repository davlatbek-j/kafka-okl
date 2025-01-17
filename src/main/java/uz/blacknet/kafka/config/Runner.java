package uz.blacknet.kafka.config;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor

@Component
public class Runner implements CommandLineRunner
{
    private final KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void run(String... args) throws Exception
    {
        for (int i = 0; i < 100; i++)
        {
            kafkaTemplate.send("ok", "I love you Zakkunai " + i);
        }
    }
}
