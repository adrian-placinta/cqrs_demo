package com.cqrs_poc.cqrs_app.command.api.dto;

import java.math.BigDecimal;

public record CreateProductReqDTO(Long name, BigDecimal price, Long quantity) {
}