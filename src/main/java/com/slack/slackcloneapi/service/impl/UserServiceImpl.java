package com.slack.slackcloneapi.service.impl;

import com.slack.slackcloneapi.dto.Users;
import com.slack.slackcloneapi.entity.User;
import com.slack.slackcloneapi.repository.UserRepository;
import com.slack.slackcloneapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void addUsers(Users users) {
        UUID randomUUID = UUID.randomUUID();
        User objUser = new User();
        objUser.setEmail(users.getEmail());
        objUser.setUsername(users.getUsername());
        objUser.setUserId(randomUUID.toString());
        userRepository.save(objUser);
    }

    @Override
    public List<Users> getAllUsers() {
        List<User> objList = userRepository.findAll();
        List<Users> objUserList = new ArrayList<>();
        for (User user : objList) {
            Users retUsers = convertDTO(user);
            objUserList.add(retUsers);
        }
        return objUserList;
    }


    private Users convertDTO(User user){
        Users objUsers =  new Users();
        objUsers.setUser_id(user.getUserId());
        objUsers.setUsername(user.getUsername());
        objUsers.setEmail(user.getEmail());
        return objUsers;
    }
}
