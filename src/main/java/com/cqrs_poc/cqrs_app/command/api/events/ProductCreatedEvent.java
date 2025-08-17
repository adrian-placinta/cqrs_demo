package com.cqrs_poc.cqrs_app.command.api.events;

import java.math.BigDecimal;

public record ProductCreatedEvent(String id, String name, BigDecimal price, Long quantity) {
}
