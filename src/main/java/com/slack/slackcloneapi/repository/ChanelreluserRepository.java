package com.slack.slackcloneapi.repository;

import com.slack.slackcloneapi.entity.Chanelreluser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChanelreluserRepository extends JpaRepository<Chanelreluser,Long> {

    List<Chanelreluser> findByChannelId(String chanelId);
}
