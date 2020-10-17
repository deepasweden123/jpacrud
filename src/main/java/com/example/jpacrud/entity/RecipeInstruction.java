package com.example.jpacrud.entity;

import java.util.Objects;

public class RecipeInstruction {

    private String id;
    private String instructions;

    public RecipeInstruction(String id, String instructions) {
        this.id = id;
        this.instructions = instructions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RecipeInstruction)) return false;
        RecipeInstruction that = (RecipeInstruction) o;
        return id.equals(that.id) &&
                instructions.equals(that.instructions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, instructions);
    }

    @Override
    public String toString() {
        return "RecipeInstruction{" +
                "id='" + id + '\'' +
                ", instructions='" + instructions + '\'' +
                '}';
    }
}
