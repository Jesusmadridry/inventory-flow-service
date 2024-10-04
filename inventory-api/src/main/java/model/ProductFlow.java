package model;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
public class ProductFlow {
    private String productId;
    private Integer quantity;
    private Flow flow;

}
