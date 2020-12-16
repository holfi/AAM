package com.example.aam_task.Model;

import lombok.Data;

// энтити
@Data
public class ProductsList {

    private Long id;
    private String name;
    private String description;

    @Override
    public String toString() {
        return "ProductsList{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
