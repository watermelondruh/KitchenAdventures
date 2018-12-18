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


public class RecipeListFragment extends Fragment {

    private Button breakfast1, breakfast2, breakfast3, mains1, mains2, mains3, dessert1, dessert2, dessert3t;


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
