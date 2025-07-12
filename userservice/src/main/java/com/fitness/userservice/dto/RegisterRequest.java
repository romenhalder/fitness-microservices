package com.fitness.userservice.dto;
//data Transfer object

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterRequest {
    @NotBlank(message = "Email is Required")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Password is Required")
    @Size(min = 6, message = "Password must have atleast 6 character")
    private String password;
    private String firstName;
    private String lastName;
}
