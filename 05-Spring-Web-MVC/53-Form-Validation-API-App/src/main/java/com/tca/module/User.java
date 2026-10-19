package com.tca.module;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @NotBlank(message = "Please Enter the username")
    private String name;

    @NotBlank(message = "Please Enter the user email")
    @Email(message = "Please enter the valid email")
    private String email;

    @NotBlank(message = "Please Enter the Mobile number")
    @Pattern(regexp = "^[7-9][0-9]{9}$" , message = "Mobile number must be 10 digit and start wth 7/8/9")
    private String mobile;
    private String gender;

    @Past(message = "Please enter the valid Date of Birth")
    private LocalDate birthDate;

}
