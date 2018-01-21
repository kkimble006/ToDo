package ca.kimble.katie_lynn.bestpractices.database.dataaccessobjects;


import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import ca.kimble.katie_lynn.bestpractices.models.ToDo;

@Dao
public interface ToDoDao {

    @Query("SELECT * FROM to_dos")
    List<ToDo> getAll();

    @Query("SELECT * FROM to_dos WHERE id = :toDoId")
    LiveData<ToDo> get(String toDoId);

    @Insert
    void insertAll(ToDo... toDos);

    @Delete
    void delete(ToDo toDo);

}
