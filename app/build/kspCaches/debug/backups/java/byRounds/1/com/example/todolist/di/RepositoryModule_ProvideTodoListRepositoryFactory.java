package com.example.todolist.di;

import com.example.todolist.data.datasource.TodoListDao;
import com.example.todolist.domain.repository.TodoListRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class RepositoryModule_ProvideTodoListRepositoryFactory implements Factory<TodoListRepository> {
  private final RepositoryModule module;

  private final Provider<TodoListDao> daoProvider;

  public RepositoryModule_ProvideTodoListRepositoryFactory(RepositoryModule module,
      Provider<TodoListDao> daoProvider) {
    this.module = module;
    this.daoProvider = daoProvider;
  }

  @Override
  public TodoListRepository get() {
    return provideTodoListRepository(module, daoProvider.get());
  }

  public static RepositoryModule_ProvideTodoListRepositoryFactory create(RepositoryModule module,
      Provider<TodoListDao> daoProvider) {
    return new RepositoryModule_ProvideTodoListRepositoryFactory(module, daoProvider);
  }

  public static TodoListRepository provideTodoListRepository(RepositoryModule instance,
      TodoListDao dao) {
    return Preconditions.checkNotNullFromProvides(instance.provideTodoListRepository(dao));
  }
}
