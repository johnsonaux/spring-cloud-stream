package com.maau.demoproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(MaauTopic.class)
public class DemoProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoProducerApplication.class, args);
    }

}
