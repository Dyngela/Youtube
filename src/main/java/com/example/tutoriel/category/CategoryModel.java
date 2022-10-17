package com.example.tutoriel.category;

import com.example.tutoriel.product.ProductEntity;
import com.example.tutoriel.product.ProductModel;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CategoryModel {
    Long categoryId;
    String name;
    List<ProductModel> productEntities;
}
