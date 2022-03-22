package com.slack.slackcloneapi.service.impl;

import com.slack.slackcloneapi.dto.ChannelMembers;
import com.slack.slackcloneapi.dto.ChannelRequest;
import com.slack.slackcloneapi.dto.Users;
import com.slack.slackcloneapi.entity.Chanelreluser;
import com.slack.slackcloneapi.entity.Channel;
import com.slack.slackcloneapi.entity.User;
import com.slack.slackcloneapi.repository.ChanelreluserRepository;
import com.slack.slackcloneapi.repository.ChannelRepository;
import com.slack.slackcloneapi.repository.UserRepository;
import com.slack.slackcloneapi.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ChannelServiceImpl implements ChannelService {


    @Autowired
    UserRepository userRepository;

    @Autowired
    ChannelRepository channelRepository;

    @Autowired
    ChanelreluserRepository chanelreluserRepository;

    @Override
    public void addChannel(ChannelRequest channelRequest) {
        UUID randomUUID = UUID.randomUUID();
        String randomId = randomUUID.toString();
        Channel objChannel = new Channel();
        objChannel.setChannelName(channelRequest.getChannel_name());
        objChannel.setDescription(channelRequest.getDescription());
        objChannel.setIsPrivate(channelRequest.getIs_private());
        objChannel.setOrganizationId(channelRequest.getOrganization_id());
        objChannel.setChannelId(randomId);
        channelRepository.save(objChannel);

        List<String> members= channelRequest.getMembers();
        for(String member : members){
            User user = userRepository.findByUserId(member);
            if(user != null ) {
                Chanelreluser chanelreluser = new Chanelreluser();
                chanelreluser.setChannelId(randomId);
                chanelreluser.setUserId(user.getUserId());
                chanelreluserRepository.save(chanelreluser);
            }

        }

    }

    @Override
    public List<ChannelMembers> getChannel() {
        List<Channel> lstChannel = channelRepository.findAll();
        List<User> lstUser = new ArrayList<>();
        List<ChannelMembers> lstChannelMembers = new ArrayList<>();
        for(Channel channel : lstChannel){
            String channelId = channel.getChannelId();
            List<Chanelreluser> lstChanelreluser =  chanelreluserRepository.findByChannelId(channelId);
            for(Chanelreluser chanelreluser : lstChanelreluser) {
                User user = userRepository.findByUserId(chanelreluser.getUserId());
                lstUser.add(user);
            }
            lstChannelMembers.add(convertDTO(channel,lstUser));
        }

        return lstChannelMembers;
    }

    private ChannelMembers convertDTO(Channel channel, List<User> lstUser) {
        ChannelMembers channelMembers = new ChannelMembers();
        channelMembers.setChannel_name(channel.getChannelName());
        channelMembers.setOrganization_id(channel.getOrganizationId());
        channelMembers.setDescription(channel.getDescription());
        channelMembers.setIs_private(channel.getIsPrivate());
        List<Users> lstMembers = new ArrayList<>();
        for (User user : lstUser) {
            Users objUsers = new Users();
            objUsers.setUser_id(user.getUserId());
            objUsers.setUsername(user.getUsername());
            objUsers.setEmail(user.getEmail());
            lstMembers.add(objUsers);
        }
        channelMembers.setMembers(lstMembers);
        return channelMembers;
    }
}
