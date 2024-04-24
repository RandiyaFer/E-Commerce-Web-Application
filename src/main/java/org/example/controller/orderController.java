package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.order;
import org.example.entity.orderEntity;
import org.example.service.orderService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
@CrossOrigin
public class orderController {
    final orderService service;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addOrder(@RequestBody order Order){ service.addOrder(Order);}
    @GetMapping("/get")
    public Iterable<orderEntity> getOrders(){
        return service.getOrders();
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
//    public Response deleteOrder(@PathVariable Long id){
//        return service.deleteOrder(id) ?
//                new Response(String.format("Deleted order Id(%s)",id)):
//                new Response(String.format("Unable to order Id(%s)",id));
//    }
    @GetMapping("search/{id}")
    public order getOrderById(@PathVariable Long id){
        return service.getOrderById(id);
    }
}
