package com.cg.pacs.pacsDemo.service;

import com.cg.pacs.pacsDemo.model.User;

public interface UserService {
    public User addUser(User user);

   public void deleteUser(Integer rollNo);
}
