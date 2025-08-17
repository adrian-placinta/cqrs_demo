package com.cqrs_poc.cqrs_app.command.api.events;

import com.cqrs_poc.cqrs_app.command.api.repository.ProductRepository;
import com.cqrs_poc.cqrs_app.command.api.util.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProductCreatedEventHandler {
    private final ProductRepository productRepository;

    @EventHandler
    public void on(ProductCreatedEvent productCreatedEvent) {
        this.productRepository.save(ProductMapper.toProduct(productCreatedEvent));
    }
}
