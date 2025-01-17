package org.example.assignmentproject.servise;

import org.example.assignmentproject.dto.ProductDto;
import org.example.assignmentproject.model.Product;
import org.example.assignmentproject.model.Result;
import org.example.assignmentproject.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    public Product getProductById(Integer id) {
        return productRepository.findById(id).orElse(null);
    }
    public Product addProduct(ProductDto productDto) {
        Product product = new Product();
        product.setName(productDto.getName());
        product.setPrice(productDto.getPrice());
        productRepository.save(product);
        return product;
    }
    public Result updateProduct(Integer id, Product productDetails) {
        return productRepository.findById(id).map(product -> {
            product.setName(productDetails.getName());
            product.setPrice(productDetails.getPrice());
            productRepository.save(product);
            return new Result(true, "Product updated successfully");
        }).orElseGet(() -> new Result(false, "Product not found"));
    }
    public Result deleteProduct(Integer id) {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
            return new Result(true, "Product deleted successfully");
        } else {
            return new Result(false, "Product not found");
        }
    }

}
