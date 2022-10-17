package com.example.tutoriel.product;

import com.example.tutoriel.category.CategoryEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@ToString
@Entity
@Table(name = "product")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = " product_id", unique = true, nullable = false)
    Long productId;

    @Column(name = "name", nullable = false)
    String name;

    @Column(name = "price", nullable = false)
    Float price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    CategoryEntity categoryEntity;

}
