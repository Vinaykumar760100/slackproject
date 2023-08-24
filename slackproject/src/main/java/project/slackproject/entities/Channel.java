package project.slackproject.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="channels")
public class Channel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "channel_id")
    private int channelid;
    @Column(name = "channel_name")
    private String channelname;
    private String description;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "workspace_access_id", insertable = false, updatable = false)
    private WorkSpaceAcccess workSpaceAcccessuser;

    @OneToMany(mappedBy = "channel")
    @JsonIgnore
    private List<ChannelAccess> channelaccess;

    @OneToMany(mappedBy = "channell")
    @JsonIgnore
    private List<Message> message;

    public int getChannelid() {
        return channelid;
    }

    public void setChannelid(int channelid) {
        this.channelid = channelid;
    }

    public String getChannelname() {
        return channelname;
    }

    public void setChannelname(String channelname) {
        this.channelname = channelname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WorkSpaceAcccess getWorkSpaceAcccessuser() {
        return workSpaceAcccessuser;
    }

    public void setWorkSpaceAcccessuser(WorkSpaceAcccess workSpaceAcccessuser) {
        this.workSpaceAcccessuser = workSpaceAcccessuser;
    }

    public List<ChannelAccess> getChannelaccess() {
        return channelaccess;
    }

    public void setChannelaccess(List<ChannelAccess> channelaccess) {
        this.channelaccess = channelaccess;
    }

    public List<Message> getMessage() {
        return message;
    }

    public void setMessage(List<Message> message) {
        this.message = message;
    }
}