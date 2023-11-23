package com.mat.crudSpringBoot.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProductDto(
        String id,
        @NotBlank
        String name,
        @NotNull
        Float price
) {
}
