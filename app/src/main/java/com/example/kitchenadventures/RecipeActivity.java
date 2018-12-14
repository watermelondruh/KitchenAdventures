package com.example.kitchenadventures;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class RecipeActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int recipeId = 0;
        Recipe recipe = Recipe.recipes[recipeId];

        TextView title = findViewById(R.id.textView_recipe_title);
        title.setText(recipe.getName());

        TextView ingredientList = (TextView) findViewById(R.id.textView_recipe_ingredientList);
        ingredientList.setText(recipe.getIngredients());

        TextView instructionList = (TextView) findViewById(R.id.textView_recipe_instructionnList);
        instructionList.setText(recipe.getInstructions());

        ImageView photo = (ImageView) findViewById(R.id.imageView_recipe);
        photo.setImageResource(recipe.getImageResourceId());
    }
}
