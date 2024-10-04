package com.inventory.model;

import lombok.Getter;

@Getter
public class MissingMandatoryFieldException extends Exception {
    public MissingMandatoryFieldException(String errorMessage) {
        super(errorMessage);
    }
}
