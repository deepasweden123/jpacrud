package com.example.jpacrud.entity;

import java.util.Objects;

public class Ingredient {

    private Integer id;
    private String ingredient;

    public Ingredient(Integer id, String ingredient) {
        this.id = id;
        this.ingredient = ingredient;
    }

    public Integer getId() {
        return id;
    }

    public String getIngredient() {
        return ingredient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(ingredient, that.ingredient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ingredient);
    }
}



