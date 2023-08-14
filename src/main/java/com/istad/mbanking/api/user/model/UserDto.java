package com.istad.mbanking.api.user.model;

import lombok.Builder;

@Builder
public record UserDto(
        String name,
        String gender,
        String StudentCardId,
        boolean isStudent) { }
