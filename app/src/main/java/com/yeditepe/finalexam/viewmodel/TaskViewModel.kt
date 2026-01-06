package com.yeditepe.finalexam.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import com.yeditepe.finalexam.model.Task



class TaskViewModel : ViewModel() {

    // TODO 1: Create a mutable state list of Task objects
    // Initially add at least 2 tasks
    private val _tasks = MutableStateFlow(listOf(
        Task(1, "cooking", false),
        Task(2, "cleaning", true)
    ))




    fun toggleTask(taskId: Int) {
        // TODO 2: Update isCompleted for the given task
        if(taskId == Task.id){
            Task.isCompleted = !task.isCompleted
        }


    }
}
