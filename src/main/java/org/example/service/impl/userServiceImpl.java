package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.user;
import org.example.entity.userEntity;
import org.example.repository.userRepository;
import org.example.service.userService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class userServiceImpl implements userService {

    final userRepository repository;

    ModelMapper mapper;
    @Bean
    public void setUp(){
        this.mapper=new ModelMapper();
    }

    @Override
    public void addUser(user User) {
        userEntity map=mapper.map(User, userEntity.class);
        repository.save(map);
    }

    @Override
    public List<userEntity> getUsers() {
        return (List<userEntity>) repository.findAll();
    }

    @Override
    public boolean deleteUser(Long id) {
        if(repository.existsById(id)){
            repository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public user getUserById(Long id) {
        Optional<userEntity> byId=repository.findById(id);
        return mapper.map(byId,user.class);
    }
}
