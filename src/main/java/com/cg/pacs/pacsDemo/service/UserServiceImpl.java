package com.cg.pacs.pacsDemo.service;

import com.cg.pacs.pacsDemo.model.User;
import com.cg.pacs.pacsDemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user){
       /* User user1 = new User();
        user1.setFirstName(user.getFirstName());
        user1.setLastName(user.getLastName());
        user1.setRollNo(user.getRollNo());*/
        User savedUser = userRepository.save(user);
        return savedUser;
    }

    @Override
    public void deleteUser(Integer rollNo){
        userRepository.deleteById(rollNo);
    }
}
