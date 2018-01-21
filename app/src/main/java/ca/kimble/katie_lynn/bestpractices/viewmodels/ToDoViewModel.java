package ca.kimble.katie_lynn.bestpractices.viewmodels;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import javax.inject.Inject;

import ca.kimble.katie_lynn.bestpractices.models.ToDo;
import ca.kimble.katie_lynn.bestpractices.repositories.ToDoRepository;

public class ToDoViewModel extends ViewModel {

    private LiveData<ToDo> toDo;
    private ToDoRepository toDoRepo;

    @Inject
    public ToDoViewModel(ToDoRepository toDoRepo) {
        this.toDoRepo = toDoRepo;
    }

    public void init(String toDoId) {

        if(this.toDo != null) {
            return;
        }

        this.toDo = toDoRepo.getToDo(toDoId);
    }
    public LiveData<ToDo> getToDo() {
        return toDo;
    }

}
