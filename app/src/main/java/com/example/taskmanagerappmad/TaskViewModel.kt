package com.example.taskmanagerappmad

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class TaskViewModel(private val repository: TaskRepository) : ViewModel() {
    val allTasks = repository.allTasks

    fun insert(task: Task) = viewModelScope.launch {
        repository.insert(task)
    }


}
