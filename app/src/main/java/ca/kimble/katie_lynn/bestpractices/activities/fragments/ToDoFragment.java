package ca.kimble.katie_lynn.bestpractices.activities.fragments;


import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ca.kimble.katie_lynn.bestpractices.R;
import ca.kimble.katie_lynn.bestpractices.viewmodels.ToDoViewModel;


public class ToDoFragment extends Fragment {
    private static final String UID_KEY = "uid";
    private ToDoViewModel viewModel;

    public ToDoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        String toDoId = getArguments().getString(UID_KEY);
        viewModel = ViewModelProviders.of(this).get(ToDoViewModel.class);
        viewModel.init(toDoId);

        viewModel.getToDo().observe(this, toDo -> {
            // update UI
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_to_do, container, false);
    }

}
