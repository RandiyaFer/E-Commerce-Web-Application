package org.example.repository;

import org.example.entity.itemEntity;
import org.springframework.data.repository.CrudRepository;

public interface itemRepository extends CrudRepository<itemEntity,Long> {

}
