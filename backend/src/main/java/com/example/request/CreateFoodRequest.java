package com.example.request;

import com.example.model.Category;
import com.example.model.IngredientsItem;
import lombok.Data;

import java.util.List;

@Data
public class CreateFoodRequest {

    private String name;
    private String description;
    private Long price;

    private Category category;
    private List<String> images;

    private Long restaurantId;
    private boolean vegitarian;
    private boolean seasonal;
    private List<IngredientsItem> ingredients;
}
