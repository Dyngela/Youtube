package com.example.tutoriel.product;

import com.example.tutoriel.category.CategoryEntity;
import com.example.tutoriel.category.CategoryModel;
import com.sun.istack.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductModel {
    Long productId;
    String name;
    Float price;
    CategoryModel categoryModel;
}
