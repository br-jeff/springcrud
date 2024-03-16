"package com.jeff.crudapi.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/product")
public class ProductController {
    @GetMapping
    public ResponseEntity listProducts() {
        return ResponseEntity.ok("Sucess");
    }
}
