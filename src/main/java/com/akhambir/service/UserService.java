package com.akhambir.service;

import com.akhambir.model.User;

public interface UserService {

    User getUser(User user);

    void create(User user);
}
