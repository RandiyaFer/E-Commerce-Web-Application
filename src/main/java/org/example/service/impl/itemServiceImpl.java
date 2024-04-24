package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.item;
import org.example.entity.itemEntity;
import org.example.repository.itemRepository;
import org.example.service.itemService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class itemServiceImpl implements itemService {

    final itemRepository repository;
    ModelMapper mapper;

//    @Bean
//    public void setUp() {
//        this.mapper = new ModelMapper();
//    }

    @Override
    public void addItem(item Item) {
        itemEntity map = mapper.map(Item, itemEntity.class);
        repository.save(map);
    }
    @Override
    public List<itemEntity> getItems() {
        return (List<itemEntity>) repository.findAll();
    }
    @Override
    public boolean deleteItem(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
    @Override
    public item getItemById(Long id) {
        Optional<itemEntity> byId = repository.findById(id);
        return mapper.map(byId, item.class);
    }
}
