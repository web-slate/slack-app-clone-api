package com.slack.slackcloneapi.dto;

import lombok.Data;

import java.util.List;

@Data
public class ChannelRequest {
    private String channel_name;
    private String organization_id;
    private String description;
    private String is_private;
    private List<String> members;

}
