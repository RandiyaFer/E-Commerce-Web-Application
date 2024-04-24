package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.admin;
import org.example.entity.adminEntity;
import org.example.service.adminService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
@CrossOrigin
public class adminController {
    final adminService service;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addAdmin(@RequestBody admin Admin){ service.addAdmin(Admin);}
    @GetMapping("/get")
    public Iterable<adminEntity> getAdmins(){
        return service.getAdmins();
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
//    public Response deleteAdmin(@PathVariable Long id){
//        return service.deleteAdmin(id) ?
//                new Response(String.format("Deleted admin Id(%s)",id)):
//                new Response(String.format("Unable to admin Id(%s)",id));
//    }
    @GetMapping("search/{id}")
    public admin getAdminById(@PathVariable Long id){
        return service.getAdminById(id);
    }
}
