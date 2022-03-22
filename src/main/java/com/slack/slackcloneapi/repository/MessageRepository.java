package com.slack.slackcloneapi.repository;

import com.slack.slackcloneapi.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository  extends JpaRepository<Message,Long> {
}
