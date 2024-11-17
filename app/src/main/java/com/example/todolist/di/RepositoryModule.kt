package com.example.todolist.di

import android.content.Context
import com.example.todolist.data.AppDatabase
import com.example.todolist.data.datasource.TodoListDao
import com.example.todolist.data.repository.TodoListRepositoryImpl
import com.example.todolist.domain.repository.TodoListRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {
    @Provides
    @Singleton
    fun provideTodoListRepository(dao: TodoListDao): TodoListRepository {
        return TodoListRepositoryImpl(dao)
    }
}
