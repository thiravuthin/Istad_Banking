package com.istad.mbanking.best;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record BestError<T> (
        Boolean status,
        Integer code,
        String message,
        LocalDateTime timestamp,
        T errors
) {

}
