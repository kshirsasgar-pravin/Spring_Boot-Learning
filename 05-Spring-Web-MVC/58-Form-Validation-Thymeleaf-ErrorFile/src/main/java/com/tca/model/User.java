package com.tca.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @NotBlank
    @Size(min = 6, max =15)
    private String username;

    @NotBlank
    @Email
    private String email;

    @Pattern(regexp = "\\d{10}")
    private String mobile;

    @NotBlank
    private String gender;

    @Past
    private LocalDate birthDate;

}
