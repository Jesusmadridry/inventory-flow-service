package com.inventory.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
public class ProductFlow {
    @NotEmpty
    private String code;

    @Min(0)
    private Integer quantity;

    @NotNull
    private Flow flow;
}
