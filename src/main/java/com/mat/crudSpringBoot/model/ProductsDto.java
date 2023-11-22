package com.mat.crudSpringBoot.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record ProductsDto(
        String id,
        @NotBlank
        String name,
        @NotNull
        Float price
) {
}
