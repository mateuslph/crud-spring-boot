package com.mat.crudSpringBoot.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Table(name="products")
@Entity(name="products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private Float price;

    public Products(ProductsDto productsDto) {
        this.name = productsDto.name();
        this.price = productsDto.price();
    }

}
