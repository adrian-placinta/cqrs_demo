package com.cqrs_poc.cqrs_app.command.api.service.impl;

import com.cqrs_poc.cqrs_app.command.api.dto.CreateProductReqDTO;
import com.cqrs_poc.cqrs_app.command.api.service.ProductCommandService;
import com.cqrs_poc.cqrs_app.command.api.util.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductCommandServiceImpl implements ProductCommandService {
    private final CommandGateway commandGateway;

    @Override
    public void addProduct(CreateProductReqDTO createProductReqDTO) {
        commandGateway.sendAndWait(ProductMapper.toCommand(createProductReqDTO));
    }

}
