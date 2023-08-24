package project.slackproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.slackproject.entities.WorkSpace;

public interface WorkSpaceRepository extends JpaRepository<WorkSpace,Integer> {

}
