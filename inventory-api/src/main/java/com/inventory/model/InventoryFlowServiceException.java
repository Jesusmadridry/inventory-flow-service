package com.inventory.model;

import lombok.Getter;

@Getter
public class InventoryFlowServiceException extends Exception {
    public InventoryFlowServiceException(String errorMessage) {
        super(errorMessage);
    }
}
