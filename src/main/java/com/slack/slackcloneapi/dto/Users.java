package com.slack.slackcloneapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Users {

    private String username;

    private String email;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private String user_id;
}
