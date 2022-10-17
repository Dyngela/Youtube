package com.example.tutoriel.product;

import com.example.tutoriel.category.CategoryDTO;
import com.example.tutoriel.category.CategoryEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductDTO {
    Long productId;
    String name;
    CategoryDTO categoryDTO;
}
