package com.maau.demokafkacloudstream;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;

@SpringBootApplication
@EnableBinding(MaauTopic.class)
@Slf4j
public class DemoCloudStreamConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoCloudStreamConsumerApplication.class, args);
    }

    @StreamListener(MaauTopic.INPUT)
    public void handleGreetings(@Payload Order order) {
        log.info("Received order at {}: {}", order.getDate(), order.getOrder());
    }

}
