package project.slackproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import project.slackproject.entities.User;
import project.slackproject.repository.UserRepositoty;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserRepositoty userrepository;
    @GetMapping("/allusers")
    public List<User> getall() {

        return userrepository.findAll();
    }

}
