package org.example.assignmentproject.servise;

import org.example.assignmentproject.dto.CartDto;
import org.example.assignmentproject.model.Cart;
import org.example.assignmentproject.model.Order;
import org.example.assignmentproject.model.Result;
import org.example.assignmentproject.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    @Autowired
    CartRepository cartRepository;

    public List<Cart> getCarts() {
        return cartRepository.findAll();
    }
    public Cart addCart(Cart cart) {
        return cartRepository.findById(cart.getId()).get();
    }
    public Result createCart(CartDto cartDto) {
        Cart cart = new Cart();
        cart.setOrderItems(cart.getOrderItems());
        cart.setCustomer(cartDto.getCustomer());
        return new Result(true,"OK");
    }
    public Result updateCart(Integer id,Cart cart) {
        if(cartRepository.findById(id).isPresent()) {
            Cart cart1 = cartRepository.findById(id).get();
            cart1.setCustomer(cart.getCustomer());
            cart1.setOrderItems(cart.getOrderItems());
            cartRepository.save(cart1);
            return new Result();

        }
        return new Result();

    }
    public Result deleteCart(Integer id) {
        if(cartRepository.findById(id).isPresent()) {
            cartRepository.deleteById(id);
            return new Result();
        }
        return new Result(true,"Deleted!");

    }
}
