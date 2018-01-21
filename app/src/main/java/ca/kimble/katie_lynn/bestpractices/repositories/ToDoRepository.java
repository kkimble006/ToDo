package ca.kimble.katie_lynn.bestpractices.repositories;

import android.arch.lifecycle.LiveData;

import java.util.concurrent.Executor;

import javax.inject.Inject;
import javax.inject.Singleton;

import ca.kimble.katie_lynn.bestpractices.database.AppDatabase;
import ca.kimble.katie_lynn.bestpractices.database.dataaccessobjects.ToDoDao;
import ca.kimble.katie_lynn.bestpractices.models.ToDo;

@Singleton
public class ToDoRepository {

    private final ToDoDao toDoDao;

    @Inject
    public ToDoRepository(ToDoDao toDoDao) {
        this.toDoDao = toDoDao;
    }

    public LiveData<ToDo> getToDo(String toDoId) {
        return toDoDao.get(toDoId);
    }
}
