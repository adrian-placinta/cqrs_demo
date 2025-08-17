package com.cqrs_poc.cqrs_app.command.api.controller;

import com.cqrs_poc.cqrs_app.command.api.dto.CreateProductReqDTO;
import com.cqrs_poc.cqrs_app.command.api.service.ProductCommandService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RequiredArgsConstructor
@RestController
public class ProductController {
    private final ProductCommandService productCommandService;

    @PostMapping("/product")
    public ResponseEntity<String> createProduct(@RequestBody CreateProductReqDTO createProductReqDTO) {
        this.productCommandService.addProduct(createProductReqDTO);
        return ResponseEntity.ok("The product was added to db!");
    }
}
