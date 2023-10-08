package com.fiap.postech.food58.core.domain.exception;

import java.io.Serial;

public class G58BusinessException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;
    public G58BusinessException(String message) {
        super(message);
    }
}
