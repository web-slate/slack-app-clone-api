package com.slack.slackcloneapi.dto;

import lombok.Data;

@Data
public class Messages {
    private Users from;
    private String message;
    private String datetime;

}
