package project.slackproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.slackproject.entities.Threads;

public interface ThreadsRepository extends JpaRepository<Threads,Integer> {
}
