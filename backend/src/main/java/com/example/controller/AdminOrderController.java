package com.example.controller;

import com.example.model.Order;
import com.example.model.User;
import com.example.request.OrderRequest;
import com.example.service.OrderService;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminOrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private UserService userService;

    @GetMapping("/order/restaurant/{id}")
    public ResponseEntity<List<Order>> getOrderHistory(
            @PathVariable Long id,
            @RequestParam(required = false) String order_status,
            @RequestHeader("Authorization") String jwt
    ) throws Exception {
        User user= userService.findUserByJwtToken(jwt);
        List<Order> orders = orderService.getRestaurantsOrder(id, order_status);
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @PutMapping("/order/order/{id/{orderStatus}")
    public ResponseEntity<Order> updateOrderStatus(
            @PathVariable Long id,
            @PathVariable String orderStatus,
            @RequestHeader("Authorization") String jwt
    ) throws Exception {
        User user= userService.findUserByJwtToken(jwt);
        Order order = orderService.updateOrder(id, orderStatus);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }
}
