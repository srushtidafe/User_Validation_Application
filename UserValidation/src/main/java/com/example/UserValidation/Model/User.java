package com.example.UserValidation.Model;


import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @NotNull
    private Integer userId ;
    @NotEmpty(message = "Why is name empty?")
    private String userName;

    private String dateOfBirth;

    @Email
    private String email;

    @Size(min = 10 , max = 12)
    @Pattern(regexp = "^[0-9]+$")
    private String phoneNo;

    private String date;

    private String time;


}

