package com.slack.slackcloneapi.dto;

import lombok.Data;

import java.util.List;

@Data
public class MessagesReqeust {
    private List<Messages> messages;

}
