package com.inventory.mapper;

import com.inventory.persist.InventoryFlow;
import com.inventory.model.ProductFlow;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface InventoryFlowMapper {

    @Mapping(target = "productCode", source = "code")
    InventoryFlow fromProductFlow(ProductFlow productFlow);
}
