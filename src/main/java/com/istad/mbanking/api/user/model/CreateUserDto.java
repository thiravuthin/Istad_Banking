package com.istad.mbanking.api.user.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record CreateUserDto(
        @NotBlank String name,
        @NotBlank String gender,
        String oneSignalId,
        String StudentCardId,
        @NotNull boolean isStudent)
{ }
