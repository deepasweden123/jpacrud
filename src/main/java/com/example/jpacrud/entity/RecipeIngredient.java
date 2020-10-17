package com.example.jpacrud.entity;

import java.util.Objects;

public class RecipeIngredient {

    private Ingredient ingredient;
    private double amount;
    private String id;

    public RecipeIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeIngredient that = (RecipeIngredient) o;
        return Double.compare(that.amount, amount) == 0 &&
                ingredient.equals(that.ingredient) &&
                id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ingredient, amount, id);
    }
}
