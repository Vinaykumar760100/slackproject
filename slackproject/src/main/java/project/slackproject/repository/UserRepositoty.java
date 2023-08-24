package project.slackproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.slackproject.entities.User;

public interface UserRepositoty extends JpaRepository<User,Integer>{
}
