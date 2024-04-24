package org.example.service;

import org.example.dto.user;
import org.example.entity.userEntity;

import java.util.List;

public interface userService {
    void addUser(user User);
    List<userEntity> getUsers();
    boolean deleteUser(Long id);
    user getUserById(Long id);
}
