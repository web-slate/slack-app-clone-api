package com.slack.slackcloneapi.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "chanelreluser")
@Data
public class Chanelreluser {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "user_id", nullable = false, length = 250)
    private String userId;

    @Column(name = "channel_id", nullable = false, length = 250)
    private String channelId;
}