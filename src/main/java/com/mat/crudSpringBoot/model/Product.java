package com.mat.crudSpringBoot.model;

import jakarta.persistence.*;
import lombok.*;

@Table(name="products")
@Entity(name="products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private Float price;
    private Boolean active;

    public Product(ProductDto productDto) {
        this.name = productDto.name();
        this.price = productDto.price();
        this.active = true;
    }

}
