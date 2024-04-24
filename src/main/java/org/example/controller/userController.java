package org.example.controller;

import lombok.RequiredArgsConstructor;
//import org.example.dto.Response;
import org.apache.catalina.connector.Response;
import org.example.dto.user;
import org.example.entity.userEntity;
import org.example.service.userService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@CrossOrigin
public class userController {
    final userService service;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addUser(@RequestBody user User){ service.addUser(User);}
    @GetMapping("/get")
    public Iterable<userEntity> getUsers(){
        return service.getUsers();
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
//    public Response deleteUser(@PathVariable Long id){
//        return service.deleteUser(id) ?
//                new Response(String.format("Deleted User Id(%s)",id)):
//                new Response(String.format("Unable to User Id(%s)",id));
//    }
    @GetMapping("search/{id}")
    public user getUserById(@PathVariable Long id){
        return service.getUserById(id);
    }
}
