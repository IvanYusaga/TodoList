package com.example.todolist.data.repository;

import com.example.todolist.data.datasource.TodoListDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class TodoListRepositoryImpl_Factory implements Factory<TodoListRepositoryImpl> {
  private final Provider<TodoListDao> daoProvider;

  public TodoListRepositoryImpl_Factory(Provider<TodoListDao> daoProvider) {
    this.daoProvider = daoProvider;
  }

  @Override
  public TodoListRepositoryImpl get() {
    return newInstance(daoProvider.get());
  }

  public static TodoListRepositoryImpl_Factory create(Provider<TodoListDao> daoProvider) {
    return new TodoListRepositoryImpl_Factory(daoProvider);
  }

  public static TodoListRepositoryImpl newInstance(TodoListDao dao) {
    return new TodoListRepositoryImpl(dao);
  }
}
