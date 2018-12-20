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

    public static final String EXTRA_RECIPEID = "recipeId";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);


        int recipeId = (Integer) getIntent().getExtras().get(EXTRA_RECIPEID);
        Recipe recipe = Recipe.recipes[recipeId];


        TextView title = findViewById(R.id.textView_recipe_title);
        title.setText("Random Stuff");

        TextView ingredients = findViewById(R.id.textView_recipe_ingredients);
        ingredients.setText(getString(R.string.Ingredients));

        TextView ingredientList = findViewById(R.id.textView_recipe_ingredientList);
        ingredientList.setText(recipe.getIngredients());

        TextView instructions = findViewById(R.id.textView_recipe_instructions);
        instructions.setText(getString(R.string.Instructions));

        TextView instructionList = findViewById(R.id.textView_recipe_instructionList);
        instructionList.setText(recipe.getInstructions());

        ImageView photo = findViewById(R.id.imageView_recipe);
        photo.setImageResource(recipe.getImageResourceId());
    }
}
