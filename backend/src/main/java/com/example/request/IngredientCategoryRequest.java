package com.example.request;

import com.sun.jdi.request.StepRequest;
import lombok.Data;

@Data
public class IngredientCategoryRequest {

    private String name;
    private Long restaurantId;
}
