package com.projectmicrosoft.microsoft.repository;

import com.projectmicrosoft.microsoft.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findAllByAssigneeId(Long assigneeId);

}
