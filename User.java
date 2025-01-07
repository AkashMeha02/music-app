package com.musicplatform.model;

import jakarta.validation.constraints.*;

public class User {
    @NotEmpty
    private String name;

    @Email
    private String email;

    @NotEmpty
    private String password;

    // Getters and Setters
}
