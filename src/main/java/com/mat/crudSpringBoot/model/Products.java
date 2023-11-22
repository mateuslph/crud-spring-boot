package com.mat.crudSpringBoot.model;

import jakarta.persistence.*;

@Entity
@Table(name="products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Float price_in_cents;

    public int getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Float getPrice_in_cents() { return price_in_cents; }
    public void setPrice_in_cents(Float price_in_cents) { this.price_in_cents = price_in_cents; }

}
