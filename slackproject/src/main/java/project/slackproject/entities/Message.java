package project.slackproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name="messages")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="message_id")
    private int messageid;
    private String content;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="channel_id",insertable = false,updatable = false)
    private Channel channel;

    private LocalDateTime timestamp;

    @Column(name="channel_access_id;")
    private int channelaccessid;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="channel_access_id",insertable = false,updatable = false)
    private ChannelAccess channelAccess;

    @OneToMany(mappedBy = "message")
    @JsonIgnore
    private List<Threads> threads;

    @OneToMany(mappedBy = "messagee")
    @JsonIgnore
    private List<Threads> threadss;

    @ManyToOne
    @JoinColumn(name="channel_id",insertable = false,updatable = false)
    private Channel channell;

    public int getMessageid() {
        return messageid;
    }

    public void setMessageid(int messageid) {
        this.messageid = messageid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public int getChannelaccessid() {
        return channelaccessid;
    }

    public void setChannelaccessid(int channelaccessid) {
        this.channelaccessid = channelaccessid;
    }

    public ChannelAccess getChannelAccess() {
        return channelAccess;
    }

    public void setChannelAccess(ChannelAccess channelAccess) {
        this.channelAccess = channelAccess;
    }

    public List<Threads> getThreads() {
        return threads;
    }

    public void setThreads(List<Threads> threads) {
        this.threads = threads;
    }

    public List<Threads> getThreadss() {
        return threadss;
    }

    public void setThreadss(List<Threads> threadss) {
        this.threadss = threadss;
    }

    public Channel getChannell() {
        return channell;
    }

    public void setChannell(Channel channell) {
        this.channell = channell;
    }
}
