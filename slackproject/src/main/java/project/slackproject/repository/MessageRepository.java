package project.slackproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.slackproject.entities.Message;

public interface MessageRepository extends JpaRepository<Message,Integer> {
}
