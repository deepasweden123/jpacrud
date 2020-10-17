package com.example.jpacrud.entity;

import java.util.List;
import java.util.Objects;

public class Recipe {

    private Integer id;
    private String recipeName;
    private List<RecipeIngredient> recipeIngredients;
    private RecipeInstruction instruction;
    private List<RecipeCategory>categories;

}


    /** Constructors **/
    public Recipe() {
    }

    public Recipe(String recipeName, List<RecipeIngredient> recipeIngredients, RecipeInstruction instruction, List<RecipeCategory> categories) {
        this.recipeName = recipeName;
        this.recipeIngredients = recipeIngredients;
        this.instruction = instruction;
        this.categories = categories;
    }

    /** Getters and setters **/
    public Integer getId() {
        return id;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public List<RecipeIngredient> getRecipeIngredients() {
        return recipeIngredients;
    }

    public void setRecipeIngredients(List<RecipeIngredient> recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }

    public RecipeInstruction getInstruction() {
        return instruction;
    }

    public void setInstruction(RecipeInstruction instruction) {
        this.instruction = instruction;
    }

    public List<RecipeCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<RecipeCategory> categories) {
        this.categories = categories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recipe)) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(id, recipe.id) &&
                Objects.equals(recipeName, recipe.recipeName) &&
                Objects.equals(recipeIngredients, recipe.recipeIngredients) &&
                Objects.equals(instruction, recipe.instruction) &&
                Objects.equals(categories, recipe.categories);
    }

    @Override


    @Override
    public int hashCode() {
        return Objects.hash(id, recipeName, recipeIngredients, instruction, categories);
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", recipeName='" + recipeName + '\'' +
                ", recipeIngredients=" + recipeIngredients +
                ", instruction=" + instruction +
                ", categories=" + categories +
                '}';
    }
}
