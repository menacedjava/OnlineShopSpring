package org.example.assignmentproject.controller;

import org.example.assignmentproject.servise.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("{/api/product/}")
public class ProductController {
    @Autowired
    ProductService productService;






}
