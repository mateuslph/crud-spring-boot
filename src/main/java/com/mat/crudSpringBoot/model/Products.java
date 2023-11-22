package com.mat.crudSpringBoot.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="products")
@Table(name="products")
@EqualsAndHashCode(of = "id")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Integer id;
    private String name;
    private Float price_in_cents;

    public Products(ProductsDto productsDto) {
        this.name = productsDto.name();
        this.price_in_cents = productsDto.price_in_cents();
    }

}
