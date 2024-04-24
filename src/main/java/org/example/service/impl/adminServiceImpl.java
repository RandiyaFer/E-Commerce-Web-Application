package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.admin;
import org.example.entity.adminEntity;
import org.example.repository.adminRepository;
import org.example.service.adminService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class adminServiceImpl implements adminService {

    final adminRepository repository;
    ModelMapper mapper;

//    @Bean
//    public void setUp() {
//        this.mapper = new ModelMapper();
//    }

    @Override
    public void addAdmin(admin Admin) {
        adminEntity map = mapper.map(Admin, adminEntity.class);
        repository.save(map);
    }
    @Override
    public List<adminEntity> getAdmins() {
        return (List<adminEntity>) repository.findAll();
    }
    @Override
    public boolean deleteAdmin(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
    @Override
    public admin getAdminById(Long id) {
        Optional<adminEntity> byId = repository.findById(id);
        return mapper.map(byId, admin.class);
    }
}
