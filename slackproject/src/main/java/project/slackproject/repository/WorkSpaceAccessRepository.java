package project.slackproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.slackproject.entities.WorkSpaceAcccess;

public interface WorkSpaceAccessRepository extends JpaRepository<WorkSpaceAcccess,Integer> {
}
