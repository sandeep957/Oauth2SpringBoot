package com.dlx.service;

import java.util.List;

import com.dlx.model.User;

public interface UserService {

    User save(User user);
    List<User> findAll();
    void delete(long id);
}
