package project.slackproject.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="channel_access")
public class ChannelAccess {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="channel_access_id")
    private int channelaccessid;

    @Column(name="channel_id")
    private int channelid;

    @Column(name="user_id")
    private int userid;

    @ManyToOne
    @JoinColumn(name="channel_access_id",insertable = false,updatable = false)
    private WorkSpaceAcccess workSpace_access;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="channel_id",insertable = false,updatable = false)
    private Channel channel;

    @OneToMany(mappedBy = "channelAccess")
    @JsonIgnore
    private List<Message> message;

    public int getChannelaccessid() {
        return channelaccessid;
    }

    public void setChannelaccessid(int channelaccessid) {
        this.channelaccessid = channelaccessid;
    }

    public int getChannelid() {
        return channelid;
    }

    public void setChannelid(int channelid) {
        this.channelid = channelid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public WorkSpaceAcccess getWorkSpace_access() {
        return workSpace_access;
    }

    public void setWorkSpace_access(WorkSpaceAcccess workSpace_access) {
        this.workSpace_access = workSpace_access;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public List<Message> getMessage() {
        return message;
    }

    public void setMessage(List<Message> message) {
        this.message = message;
    }
}
