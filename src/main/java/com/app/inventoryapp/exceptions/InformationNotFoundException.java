package com.app.inventoryapp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)

public class InformationNotFoundException extends RuntimeException {
    public InformationNotFoundException(String message) {
            super(message);
        }

    }
