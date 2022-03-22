package com.slack.slackcloneapi.api;


import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.slack.slackcloneapi.dto.*;
import com.slack.slackcloneapi.service.ChannelService;
import com.slack.slackcloneapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class SlackController {

    @Autowired
    private UserService userService;

    @Autowired
    private ChannelService channelService;

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
        List<Users> userResponse = userService.getAllUsers();
        if (!userResponse.isEmpty()) {
            return ResponseEntity.ok().body(userResponse);
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    @PostMapping(value = "/addusers")
    public ResponseEntity<?> addUsers(@RequestBody Users users) {
        if(users.getUsername() != null && users.getEmail() != null){
            userService.addUsers(users);
            return ResponseEntity.ok().body("Successfully Added User");
        }else{
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping(value = "/channel")
    public ResponseEntity<?> addChannel(@RequestBody ChannelRequest channelRequest) {
             channelService.addChannel(channelRequest);
            return ResponseEntity.ok().body("Successfully Added Channel");

    }

    @GetMapping(value = "/channel")
    public ResponseEntity<?> getChannel() {
        List<ChannelMembers> channelResponse =  channelService.getChannel();
        return ResponseEntity.ok().body(channelResponse);

    }

    @GetMapping(value = "/messages/{id}/{id1}/messages/{chanelid}/{organizationid}")
    public ResponseEntity<?> getMessages(@PathVariable String id,@PathVariable String id1,@PathVariable String chanelid,@PathVariable String organizationid) {
        MessagesReqeust messagesReqeust = new MessagesReqeust();
        messagesReqeust.setMessages(testMsgData());
        List<MessagesReqeust> objMessageResponse= new ArrayList<>();
        objMessageResponse.add(messagesReqeust);
        if (objMessageResponse != null) {
            return ResponseEntity.ok().body(objMessageResponse);
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

    public List<Messages> testMsgData() {
        List<Messages> lstMessages = new ArrayList<>();
        Messages org = new Messages();
        Users objUsers = new Users();
        objUsers.setEmail("john@gmail.com");
        objUsers.setUsername("John");
        objUsers.setUser_id("1e780ade-a524-11ec-b909-0242ac120002");
        org.setFrom(objUsers);
        org.setMessage("This is test message");
        org.setDatetime("1647433741");
        lstMessages.add(org);
        return lstMessages;
    }



}