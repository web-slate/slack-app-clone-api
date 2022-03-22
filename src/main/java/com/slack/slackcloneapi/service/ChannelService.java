package com.slack.slackcloneapi.service;

import com.slack.slackcloneapi.dto.ChannelMembers;
import com.slack.slackcloneapi.dto.ChannelRequest;

import java.util.List;

public interface ChannelService {
    void addChannel(ChannelRequest channelRequest);

    List<ChannelMembers> getChannel();
}
