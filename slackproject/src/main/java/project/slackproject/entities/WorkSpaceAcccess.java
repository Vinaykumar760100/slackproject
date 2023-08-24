package project.slackproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="workspace_access")
public class WorkSpaceAcccess {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "workspace_access_id")
    private int workspace_access_id;

    @Column(name="workspace_id")
    private int workspace_id;

    @Column(name="workspace_user_id")
    private int workspace_user_id;

    @ManyToMany
    @JsonIgnore
    @JoinTable(
            name = "workspace_access",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "workspace_id")
    )
    private List<User> users;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "workspace_id",insertable = false,updatable = false)
    private WorkSpace workSpace;


    @OneToMany(mappedBy = "workSpaceAcccessuser")
    @JsonIgnore
    private List<Channel> channels;


    @OneToMany(mappedBy = "workSpace_access")
    private List<ChannelAccess> channelAccesses;

    public int getWorkspace_access_id() {
        return workspace_access_id;
    }

    public void setWorkspace_access_id(int workspace_access_id) {
        this.workspace_access_id = workspace_access_id;
    }

    public int getWorkspace_id() {
        return workspace_id;
    }

    public void setWorkspace_id(int workspace_id) {
        this.workspace_id = workspace_id;
    }

    public int getWorkspace_user_id() {
        return workspace_user_id;
    }

    public void setWorkspace_user_id(int workspace_user_id) {
        this.workspace_user_id = workspace_user_id;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public WorkSpace getWorkSpace() {
        return workSpace;
    }

    public void setWorkSpace(WorkSpace workSpace) {
        this.workSpace = workSpace;
    }

    public List<Channel> getChannels() {
        return channels;
    }

    public void setChannels(List<Channel> channels) {
        this.channels = channels;
    }

    public List<ChannelAccess> getChannelAccesses() {
        return channelAccesses;
    }

    public void setChannelAccesses(List<ChannelAccess> channelAccesses) {
        this.channelAccesses = channelAccesses;
    }
}