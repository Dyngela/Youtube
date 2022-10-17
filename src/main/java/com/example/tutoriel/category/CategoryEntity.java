package com.example.tutoriel.category;

import com.example.tutoriel.product.ProductEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@ToString
@Entity
@Table(name = "category")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "category_id", unique = true, nullable = false)
    Long categoryId;

    @Column(name = "name", nullable = false)
    String name;

    @OneToMany(mappedBy = "categoryEntity")
    List<ProductEntity> productEntities;

}
