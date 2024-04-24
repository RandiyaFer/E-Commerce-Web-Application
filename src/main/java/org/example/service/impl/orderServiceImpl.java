package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.order;
import org.example.dto.user;
import org.example.entity.orderEntity;
import org.example.entity.userEntity;
import org.example.repository.orderRepository;
import org.example.service.orderService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class orderServiceImpl implements orderService {

    final orderRepository repository;
    ModelMapper mapper;

//    @Bean
//    public void setUp() {
//        this.mapper = new ModelMapper();
//    }

    @Override
    public void addOrder(order Order) {
        orderEntity map = mapper.map(Order, orderEntity.class);
        repository.save(map);
    }
    @Override
    public List<orderEntity> getOrders() {
        return (List<orderEntity>) repository.findAll();
    }
    @Override
    public boolean deleteOrder(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
    @Override
    public order getOrderById(Long id) {
        Optional<orderEntity> byId = repository.findById(id);
        return mapper.map(byId, order.class);
    }
}
