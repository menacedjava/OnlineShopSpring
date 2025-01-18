package org.example.assignmentproject.controller;

import org.example.assignmentproject.dto.ProductDto;
import org.example.assignmentproject.model.Product;
import org.example.assignmentproject.model.Result;
import org.example.assignmentproject.servise.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;


    @GetMapping
    public List<Product> getALl() {
        List<Product> productList = productService.getAllProducts();
        return productList;
    }

    @GetMapping("/{id}")
    public Product getBYID(@PathVariable Integer id) {
        Product productById = productService.getProductById(id);
        return productById;
    }

    @PostMapping
    public Result create(@RequestBody ProductDto productDto) {
        Result result = productService.addProduct(productDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody ProductDto productDto) {
        Result result = productService.updateProduct(id, productDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result del(@PathVariable Integer id) {
        Result result = productService.deleteProduct(id);
        return result;
    }


}
