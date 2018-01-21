package ca.kimble.katie_lynn.bestpractices.viewmodels;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import ca.kimble.katie_lynn.bestpractices.models.ToDo;

public class ToDoViewModel extends ViewModel {

    private String toDoId;
    private LiveData<ToDo> toDo;

    public void init(String userId) {
        this.toDoId = userId;
    }
    public LiveData<ToDo> getToDo() {
        return toDo;
    }

}
