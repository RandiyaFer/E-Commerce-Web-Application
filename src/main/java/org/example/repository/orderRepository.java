package org.example.repository;

import org.example.entity.orderEntity;
import org.springframework.data.repository.CrudRepository;

public interface orderRepository extends CrudRepository<orderEntity,Long> {

}
