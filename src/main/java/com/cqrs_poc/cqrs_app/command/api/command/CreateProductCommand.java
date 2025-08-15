package com.cqrs_poc.cqrs_app.command.api.command;

import lombok.Builder;
import lombok.Getter;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.math.BigDecimal;

@Builder
@Getter
public class CreateProductCommand {
    @TargetAggregateIdentifier
    private String id;
    private Long name;
    private BigDecimal price;
    private Long quantity;
}
