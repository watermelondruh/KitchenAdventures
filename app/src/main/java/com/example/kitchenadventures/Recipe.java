package com.example.kitchenadventures;

public class Recipe {
    private String name;
    private String ingredients;
    private String instructions;
    private int imageResourceId;

    public static final Recipe[] recipes = {
            new Recipe("Carrrot Cake Oatmeal", "-3/4 cup rolled oats \n -1 tsp pumpkin spice \n -1 large carrot \n -1 cup water \n -1/2 cup plant-based milk \n -1 tbsp sweetener of choice \n",
                    "1. In a pot on medium heat, add in oats, water, and milk.\n2. Using a grater, shred your carrot into the pot as the oatmeal cooks.\n3. Add in pumpkin spice, stir well, and cover the pot to cook on low heat.\n4. Once the oats are cooked to your desired texture, sweeten to taste and remove from heat. Serve warm and enjoy!", R.drawable.breakfast1),
            new Recipe("Chia Smoothie Jars", "chia pudding\n" +
                    "-1/4 cup chia seeds\n" +
                    "-1 cup plant milk\n" +
                    "-sweetener, to taste\n" +
                    "strawberry nice cream\n" +
                    "-2 frozen bananas\n" +
                    "-1 cup frozen strawberries\n" +
                    "-1/4 cup plant milk", "1. In a jar, whisk together all chia pudding ingredients and set aside for 2+ hours in the fridge.\n2. Once ready to eat, blend the smoothie ingredients until creamy.\n3. layer with the chia pudding as desired.", R.drawable.breakfast2),
            new Recipe("Chocolate Peanut Butter Waffles", "-3/4 cup flour\n" +
                    "-2 tbsp cocoa powder\n" +
                    "-1 tsp baking powder\n" +
                    "-1 tbsp peanut butter\n" +
                    "-1 tbsp maple syrup\n" +
                    "-1/4 cup applesauce\n" +
                    "-1/2 cup plant milk", "1. Preheat and grease a waffle iron.\n" +
                    "2. In a bowl, mix together flour, cocoa powder, and baking powder. Separately, mix together the  wet ingredients and pour it into the flour mixture.\n" +
                    "3. Whisk the two mixtures until combined and slightly lumpy.\n" +
                    "4. Spoon batter onto the waffle iron, then cook until both sides are browned. Repeat until all the batter is used up.\n" +
                    "5. Serve warm and enjoy!", R.drawable.breakfast3),
            new Recipe("Sweet & Spicy Miso Tofu", "-1 package firm tofu\n" +
                    "-1/4 cup soy sauce\n" +
                    "-1 tbsp sesame oil\n" +
                    "-3 tbsp maple syrup\n" +
                    "-1-2 tbsp rice vinegar, to taste\n" +
                    "-2 tbsp miso paste\n" +
                    "-3 tbsp sriracha\n" +
                    "-1 tsp red chili flakes", "1. Press tofu between 2 paper towels and place an heavy object on top for 10 mins.\n" +
                    "2. Meanwhile, mix the other ingredients in a shallow dish.\n" +
                    "3. Cut tofu into cubes and place in the marinade, coating well. Set aside for 15 mins and preheat oven to 400°F.\n" +
                    "4. Bake the tofu on a lined baking sheet for 20 minutes. At halfway, flip and pour on remaining sauce.\n" +
                    "5. When caramelized, remove tofu from heat and enjoy!", R.drawable.mains5),
            new Recipe("Avocado 'Pesto'", "-1 large avocado\n" +
                    "-1-2 tbsp lemon juice\n" +
                    "-1 cup fresh basil leaves\n" +
                    "-2 cloves garlic\n" +
                    "-4 tbsp plant-based milk\n" +
                    "-salt and pepper to taste", "1. Combine all the ingredients in a blender and whizz into a creamy sauce.\n2. Toss with 2 servings of cooked pasta & enjoy!", R.drawable.mains2),
            new Recipe("'Meaty' Vegan Chili", "-1 onion, diced\n" +
                    "-3 cloves garlic, minced\n" +
                    "-1/2 can chipotle peppers in adobo sauce (adjust to taste)\n" +
                    "-1/2 tsp cumin, 1 tbsp chili powder\n" +
                    "-1 bell pepper, diced\n" +
                    "-2 large tomatoes, diced\n" +
                    "-1 8-oz can tomato sauce\n" +
                    "-1 15-oz can kidney beans, drained\n" +
                    "-1/2 cup TVP\n" +
                    "-1/2 cup water", "1.On medium heat, sautee the onions and garlic in a large pot for 4-5 minutes, until fragrant.\n" +
                    "2. Add in chipotle peppers, cumin, and chili powder; stir until incorporated.\n" +
                    "3. Mix in all remaining ingredients. Cover the pot, bring to a boil, then let simmer on low heat for 7-8 minutes.\n" +
                    "4. Once thickened & TVP is cooked through, remove from heat & serve warm.", R.drawable.mains3),

    };

    private Recipe(String name, String ingredients, String instructions, int imageResourceId){
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

