package org.example.service;

import org.example.dto.admin;
import org.example.entity.adminEntity;

import java.util.List;

public interface adminService {
    void addAdmin(admin Admin);
    List<adminEntity> getAdmins();
    boolean deleteAdmin(Long id);
    admin getAdminById(Long id);
}
