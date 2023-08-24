package project.slackproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.slackproject.entities.Channel;

public interface ChannelAccessRepository extends JpaRepository<Channel,Integer> {
}
