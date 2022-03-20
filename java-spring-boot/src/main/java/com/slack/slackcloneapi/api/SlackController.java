package com.slack.slackcloneapi.api;


import com.slack.slackcloneapi.dto.Organization;
import com.slack.slackcloneapi.dto.Users;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class SlackController {

    @GetMapping(value = "/organization/{id}")
    public ResponseEntity<?> getOrganisation(@PathVariable String id) {
        Organization orgResponse = testOrgData();
        if (orgResponse != null) {
            return ResponseEntity.ok().body(orgResponse);
        } else {
            return ResponseEntity.noContent().build();
        }
    }


    @GetMapping(value = "/users")
    public ResponseEntity<?> getUsers() {
        List<Users> userResponse = testUserData();
        if (!userResponse.isEmpty()) {
            return ResponseEntity.ok().body(userResponse);
        } else {
            return ResponseEntity.noContent().build();
        }
    }


    public Organization testOrgData() {
        Organization org = new Organization();
        org.setOrganization_id("1ae5241e-a51b-11ec-b909-0242ac120002");
        org.setOrganization_name("Full Stack");
        return org;
    }


    public List<Users> testUserData() {
        List<Users> objUser = new ArrayList<>();
         Users user = new Users();
        user.setUser_id("1e780ade-a524-11ec-b909-0242ac120002");
        user.setUsername("John");
        user.setEmail("john@gmail.com");
        objUser.add(user);
        user = new Users();
        user.setUser_id("6ef005fc-a524-11ec-b909-0242ac120002");
        user.setUsername("Bob");
        user.setEmail("bob@gmail.com");
        objUser.add(user);
        user = new Users();
        user.setUser_id("7f093ecc-a524-11ec-b909-0242ac120002");
        user.setUsername("Alex");
        user.setEmail("alex@gmail.com");
        objUser.add(user);
        return objUser;
    }
}