package com.example.tutoriel.category;

import com.example.tutoriel.product.ProductDTO;
import com.example.tutoriel.product.ProductModel;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CategoryDTO {
    Long categoryId;
    String name;
    List<ProductDTO> productDTOS;
}
