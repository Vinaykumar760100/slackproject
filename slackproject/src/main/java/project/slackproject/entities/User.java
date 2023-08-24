package project.slackproject.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int user_id;
    @Column(name = "User_name")
    private String name;
    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<WorkSpace> workSpaces;

    @ManyToMany(mappedBy = "users")
    @JsonIgnore
    private List<WorkSpaceAcccess> workSpaceAccessess;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<WorkSpace> getWorkSpaces() {
        return workSpaces;
    }

    public void setWorkSpaces(List<WorkSpace> workSpaces) {
        this.workSpaces = workSpaces;
    }

    public List<WorkSpaceAcccess> getWorkSpaceAccessess() {
        return workSpaceAccessess;
    }

    public void setWorkSpaceAccessess(List<WorkSpaceAcccess> workSpaceAccessess) {
        this.workSpaceAccessess = workSpaceAccessess;
    }
}