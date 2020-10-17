package com.example.jpacrud.entity;

import ch.qos.logback.classic.spi.ClassPackagingData;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class RecipeInstruction {





        @Id
        @GeneratedValue(generator = "UUID")
        @GenericGenerator(
                name = "UUID",
                strategy = "org.hibernate.id.UUIDGenerator",
                parameters = {
                        @Parameter(
                                name = "uuid_gen_strategy_class",
                                value = "org.hibernate.id.uuid.CustomVersionOneStrategy"
                        )
                }
        )
        @Column(name = "id", updatable = false, nullable = false)
        private String id;
    private String instructions;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeInstruction that = (RecipeInstruction) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(instructions, that.instructions);
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
