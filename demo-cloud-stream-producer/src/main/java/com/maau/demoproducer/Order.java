package com.maau.demoproducer;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class Order {

    private String order;
    private LocalDateTime date;
}
