package org.example.repository;

import org.example.entity.userEntity;
import org.springframework.data.repository.CrudRepository;

public interface userRepository extends CrudRepository<userEntity,Long> {

}
