package com.example.kitchenadventures;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RecipeListFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_recipe_list, container, false);

        ListView listRecipes = view.findViewById(R.id.list_recipeListFragment_recipes);
        ArrayAdapter<Recipe> listAdapter = new ArrayAdapter<Recipe>(getContext(), android.R.layout.simple_list_item_1, Recipe.recipes);
        listRecipes.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), RecipeActivity.class);
                intent.putExtra(RecipeActivity.EXTRA_RECIPEID, (int) id);
                startActivity(intent);
            }
        };

        listRecipes.setOnItemClickListener(itemClickListener);

        return view;
    }


    /*
    private Button breakfast1, breakfast2, breakfast3, mains1, mains2, mains3, dessert1, dessert2, dessert3;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_recipe_list, container, false);
        breakfast1 = view.findViewById(R.id.button_recipeList_breakfast1);
        breakfast2 = view.findViewById(R.id.button_recipeList_breakfast2);
        breakfast3 = view.findViewById(R.id.button_recipeList_breakfast3);
        mains1 = view.findViewById(R.id.button_recipeList_mains1);
        mains2 = view.findViewById(R.id.button_recipeList_mains2);
        mains3 = view.findViewById(R.id.button_recipeList_mains3);
        dessert1 = view.findViewById(R.id.button_recipeList_dessert1);
        dessert2 = view.findViewById(R.id.button_recipeList_dessert2);
        dessert3 = view.findViewById(R.id.button_recipeList_dessert3);
        setOnClickListeners();
        return view;
    }

    private void setOnClickListeners() {
        breakfast1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RecipeActivity.class);
                intent.putExtra(RecipeActivity.EXTRA_RECIPEID, 0);
                startActivity(intent);
            }
        });
        breakfast2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RecipeActivity.class);
                intent.putExtra(RecipeActivity.EXTRA_RECIPEID, 1);
                startActivity(intent);
            }
        });
        breakfast3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RecipeActivity.class);
                intent.putExtra(RecipeActivity.EXTRA_RECIPEID, 2);
                startActivity(intent);
            }
        });
        mains1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RecipeActivity.class);
                intent.putExtra(RecipeActivity.EXTRA_RECIPEID, 3)
                startActivity(intent);
            }
        });
        mains2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RecipeActivity.class);
                intent.putExtra(RecipeActivity.EXTRA_RECIPEID, 4);
                startActivity(intent);
            }
        });
        mains3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RecipeActivity.class);
                intent.putExtra(RecipeActivity.EXTRA_RECIPEID, 5);
                startActivity(intent);
            }
        });
        dessert1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RecipeActivity.class);
                intent.putExtra(RecipeActivity.EXTRA_RECIPEID, 6);
                startActivity(intent);
            }
        });
        dessert2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RecipeActivity.class);
                intent.putExtra(RecipeActivity.EXTRA_RECIPEID, 7);
                startActivity(intent);
            }
        });
        dessert3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RecipeActivity.class);
                intent.putExtra(RecipeActivity.EXTRA_RECIPEID, 8);
                startActivity(intent);
            }
        });
        */

}
