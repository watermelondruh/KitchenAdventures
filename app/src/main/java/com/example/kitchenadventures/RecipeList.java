package com.example.kitchenadventures;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class RecipeList extends Fragment {

    private Button buttonCarrot;
    private Button buttonJar;
    private Button buttonWaffle;
    private Button buttonPesto;
    private Button buttonChili;
    private Button buttonNoodles;
    private Button buttonChocolate;
    private Button buttonCinnamon;
    private Button buttonMuffins;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_recipe_list, container, false);
        wireWidgets();
        return rootView;
    }

    private void wireWidgets() {
        buttonCarrot.findViewById(R.id.button_recipeList_carrot);
        buttonJar.findViewById(R.id.button_recipeList_jar);
        buttonWaffle.findViewById(R.id.button_recipeList_waffle);
    }


}
