package com.shah.tasks.mappers;

import com.shah.tasks.domain.dto.TaskListDto;
import com.shah.tasks.domain.entities.TaskList;

public interface TaskListMapper {

    TaskList fromDto(TaskListDto taskListDto);

    TaskListDto toDto(TaskList taskList);

}
