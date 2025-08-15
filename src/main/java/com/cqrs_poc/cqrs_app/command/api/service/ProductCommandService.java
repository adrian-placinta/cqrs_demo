package com.cqrs_poc.cqrs_app.command.api.service;

import com.cqrs_poc.cqrs_app.command.api.dto.CreateProductReqDTO;

public interface ProductCommandService {
    String addProduct(CreateProductReqDTO createProductReqDTO);
}
