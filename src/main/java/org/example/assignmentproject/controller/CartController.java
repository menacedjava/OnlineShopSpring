package org.example.assignmentproject.controller;

import org.example.assignmentproject.dto.CartDto;
import org.example.assignmentproject.model.Cart;
import org.example.assignmentproject.model.Product;
import org.example.assignmentproject.model.Result;
import org.example.assignmentproject.servise.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    @Autowired
    CartService cartService;

    @GetMapping
    public List<Cart> getCart() {
        List<Cart> cartList=cartService.getCarts();
        return cartList;
    }
    @GetMapping("/{id}")
    public Cart getBYID(@PathVariable Integer id) {
        Cart cartById = cartService.getCartById(id);
        return cartById;
    }
    @PostMapping
    public Result create(@RequestBody CartDto cartDto) {
        Result result = cartService.createCart(cartDto);
        return result;
    }
    @PutMapping ("/id")
    public Result update(@PathVariable Integer id,@RequestBody CartDto cartDto) {
        Result result=cartService.updateCart(id,cartDto);
        return result;
    }
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        Result result=cartService.deleteCart(id);
        return result;
    }


}
