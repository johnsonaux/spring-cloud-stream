package com.maau.demoproducer;

import java.time.LocalDateTime;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class OrderDistributionService {

    private final MaauTopic maauTopic;

    public OrderDistributionService(MaauTopic maauTopic) {
        this.maauTopic = maauTopic;
    }

    public void send(Order order) {
        log.info("Order is {}", order.getOrder());
        order.setDate(LocalDateTime.now());
        maauTopic.outboundGreeting().send(MessageBuilder
            .withPayload(order)
            .build());
    }
}
