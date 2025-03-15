package com.safe.SafeNotes.services;


import com.safe.SafeNotes.dtos.UserDTO;
import com.safe.SafeNotes.models.User;

import java.util.List;

public interface UserService {
    void updateUserRole(Long userId, String roleName);

    List<User> getAllUsers();

    UserDTO getUserById(Long id);

    // UserServiceImpl.java
    User findByUsername(String username);
}