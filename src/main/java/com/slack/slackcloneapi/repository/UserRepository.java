package com.slack.slackcloneapi.repository;

import com.slack.slackcloneapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {

    User  findByUserId(String userId);
}
