package com.cqrs_poc.cqrs_app.command.api.events;

import java.math.BigDecimal;

public record ProductCreatedEvent(String id, Long name, BigDecimal price, Long quantity) {
}
