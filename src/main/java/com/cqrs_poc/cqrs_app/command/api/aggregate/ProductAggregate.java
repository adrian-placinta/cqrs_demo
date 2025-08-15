package com.cqrs_poc.cqrs_app.command.api.aggregate;

import com.cqrs_poc.cqrs_app.command.api.command.CreateProductCommand;
import com.cqrs_poc.cqrs_app.command.api.events.ProductCreatedEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;

import java.math.BigDecimal;

public class ProductAggregate {
    @AggregateIdentifier
    private String id;
    private Long name;
    private BigDecimal price;
    private Long quantity;

    @CommandHandler
    ProductAggregate(CreateProductCommand createProductCommand) {
        AggregateLifecycle
                .apply(new ProductCreatedEvent(createProductCommand.getId(),
                createProductCommand.getName(),
                createProductCommand.getPrice(),
                createProductCommand.getQuantity()));
    }

    @EventSourcingHandler
    void on(ProductCreatedEvent productCreatedEvent) {
        id = productCreatedEvent.id();
        name = productCreatedEvent.name();
        price = productCreatedEvent.price();
        quantity = productCreatedEvent.quantity();
    }
}
