package org.example.service;

import org.example.dto.item;
import org.example.entity.itemEntity;

import java.util.List;

public interface itemService {
    void addItem(item Item);
    List<itemEntity> getItems();
    boolean deleteItem(Long id);
    item getItemById(Long id);
}
