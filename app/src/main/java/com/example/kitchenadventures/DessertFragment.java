package com.example.kitchenadventures;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class DessertFragment extends Fragment {

    private int x;
    private Button buttonRandomize;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_dessert, container, false);
        buttonRandomize = rootView.findViewById(R.id.button_dessert);
        setListeners();
        return rootView;
    }

    private void wireWidgets() {
        buttonRandomize.findViewById(R.id.button_dessert);
    }

    private void setListeners() {
        buttonRandomize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RecipeActivity.class);
                intent.putExtra(RecipeActivity.EXTRA_RECIPEID, randomize());
                startActivity(intent);
            }
        });
    }

    private int randomize() {
        x = (int) (Math.random() * 3);
        if(x == 0){
            return 0;
        }
        else if (x == 1) {
            return 1;
        }
        else {
            return 2;
        }
    }
}
