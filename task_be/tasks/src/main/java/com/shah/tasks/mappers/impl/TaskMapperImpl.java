package com.shah.tasks.mappers.impl;

import com.shah.tasks.domain.dto.TaskDto;
import com.shah.tasks.domain.entities.Task;
import com.shah.tasks.mappers.TaskMapper;
import jakarta.persistence.Column;
import org.springframework.stereotype.Component;

@Component
public class TaskMapperImpl implements TaskMapper {

    @Override
    public Task fromDto(TaskDto taskDto) {
        return new Task(
                taskDto.id(),
                taskDto.title(),
                taskDto.description(),
                taskDto.dueDate(),
                taskDto.status(),
                taskDto.priority(),
                null,
                null,
                null
        );
    }

    @Override
    public TaskDto toDto(Task task) {
        return new TaskDto(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getDueTime(),
                task.getPriority(),
                task.getStatus()
        );
    }

}
