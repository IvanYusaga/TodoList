package com.example.todolist.data.repository

import com.example.todolist.data.datasource.TodoListDao
import com.example.todolist.domain.model.TodoList
import com.example.todolist.domain.repository.TodoListRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TodoListRepositoryImpl @Inject constructor(
    private val dao: TodoListDao,
): TodoListRepository {
    override suspend fun getList(): Flow<List<TodoList>> {
        return dao.getAllTodoList()
    }

    override suspend fun insertTodoList(todoList: TodoList) {
        dao.insertTodoList(todoList)
    }

    override suspend fun deleteTodoList(todoList: TodoList) {
        dao.deleteTodoList(todoList)
    }


}
