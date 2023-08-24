package project.slackproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="workspaces")
public class WorkSpace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="workspace_id")
    private int workspaceid;

    @Column(name="workspace_name")
    private String workspacename;

    @Column(name="description")
    private String description;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="created_by",insertable = false,updatable = false)
    private User user;

    @OneToMany(mappedBy = "workSpace")
    @JsonIgnore
    private List<WorkSpaceAcccess> workSpaceAcccess;

    public int getWorkspaceid() {
        return workspaceid;
    }

    public void setWorkspaceid(int workspaceid) {
        this.workspaceid = workspaceid;
    }

    public String getWorkspacename() {
        return workspacename;
    }

    public void setWorkspacename(String workspacename) {
        this.workspacename = workspacename;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<WorkSpaceAcccess> getWorkSpaceAcccess() {
        return workSpaceAcccess;
    }

    public void setWorkSpaceAcccess(List<WorkSpaceAcccess> workSpaceAcccess) {
        this.workSpaceAcccess = workSpaceAcccess;
    }
}
