package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.item;
import org.example.entity.itemEntity;
import org.example.service.itemService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
@RequiredArgsConstructor
@CrossOrigin
public class itemController {
    final itemService service;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addItem(@RequestBody item Item){ service.addItem(Item);}
    @GetMapping("/get")
    public Iterable<itemEntity> getItems(){
        return service.getItems();
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
//    public Response deleteItem(@PathVariable Long id){
//        return service.deleteItem(id) ?
//                new Response(String.format("Deleted item Id(%s)",id)):
//                new Response(String.format("Unable to item Id(%s)",id));
//    }
    @GetMapping("search/{id}")
    public item getItemById(@PathVariable Long id){
        return service.getItemById(id);
    }
}
