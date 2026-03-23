package com.shah.tasks.mappers;

import com.shah.tasks.domain.dto.TaskDto;
import com.shah.tasks.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);
    TaskDto toDto (Task task);

}
