package com.yeditepe.finalexam.repository

import com.yeditepe.finalexam.api.TaskApi
import com.yeditepe.finalexam.model.Task

class TaskRepository(private val api: TaskApi) {

    suspend fun fetchTasks(): List<Task> {
        // TODO 1: Call API
        val taskDtos = api.getTasks()

        // TODO 2: Convert TaskDto list to Task list
        val tasks = taskDtos.map { taskDto ->
            Task(taskDto.id, taskDto.title, taskDto.completed)
        }

        return TODO("Provide the return value")
    }
}
