package com.cqrs_poc.cqrs_app.command.api.util.mapper;

import com.cqrs_poc.cqrs_app.command.api.command.CreateProductCommand;
import com.cqrs_poc.cqrs_app.command.api.dto.CreateProductReqDTO;
import com.cqrs_poc.cqrs_app.command.api.events.ProductCreatedEvent;
import com.cqrs_poc.cqrs_app.command.api.model.Product;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.NONE)
public class ProductMapper {
    public static CreateProductCommand toCommand(CreateProductReqDTO createProductReqDTO) {
        return CreateProductCommand
                .builder()
                .id(UUID.randomUUID().toString())
                .name(createProductReqDTO.name())
                .price(createProductReqDTO.price())
                .quantity(createProductReqDTO.quantity())
                .build();
    }

    public static Product toProduct(ProductCreatedEvent productCreatedEvent) {
        Product product = new Product();
        product.setName(productCreatedEvent.name());
        product.setQuantity(product.getQuantity());
        product.setPrice(productCreatedEvent.price());
        return product;
    }
}
