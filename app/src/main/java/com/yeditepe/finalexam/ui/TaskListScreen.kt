package com.yeditepe.finalexam.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.yeditepe.finalexam.model.Task
import com.yeditepe.finalexam.viewmodel.TaskViewModel
import androidx.navigation.compose.rememberNavController
import com.yeditepe.finalexam.navigation.AppNavGraph
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.yeditepe.finalexam.ui.TaskDetailScreen
import com.yeditepe.finalexam.ui.TaskListScreen
import com.yeditepe.finalexam.ui.TaskItemScreen



@Composable
fun TaskListScreen(viewModel: TaskViewModel = viewModel()) {

    // TODO 3: Read task list from ViewModel
    val tasks = viewModel.tasks


    Column {
        // TODO 4: Display task titles and completion status
        // Use a simple Column or LazyColumn
        tasks.forEach { task ->
            TaskRow(task = task, navController = navController)
        }
    }
}

@Composable
fun TaskRow(task: Task, navController: NavController) {

    Text(
        text = task.title,
        modifier = Modifier.clickable {
            // TODO 3: Navigate to detail screen with task title
            navController.navigate("taskDetail/${task.title}")
        }
    )
}
