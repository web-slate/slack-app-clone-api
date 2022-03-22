package com.slack.slackcloneapi.service;

import com.slack.slackcloneapi.dto.Users;

import java.util.List;

public interface UserService {
    void addUsers(Users users);

    List<Users> getAllUsers();
}
