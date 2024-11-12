package com.example.repository;

import com.example.model.Cart;
import com.example.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {

    public Cart findByCustomerId(Long id);

}
