package com.slack.slackcloneapi.repository;

import com.slack.slackcloneapi.entity.Channel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChannelRepository extends JpaRepository<Channel,Long> {


}
