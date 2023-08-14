package com.istad.mbanking.api.auth.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;

public record RegisterDto (
        @NotBlank(message = "Email is required!")
        String email,
        @NotBlank(message = "Password is required!")
        String password,
        @NotBlank(message = "Confirm Password is required")
        String confirmedPassword
){

}
