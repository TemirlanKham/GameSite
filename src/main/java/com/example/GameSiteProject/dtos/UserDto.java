package com.example.GameSiteProject.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

@Data
public class UserDto {

    private Long id;
    private String name;
    private String username;
    private String password;
    private String passwordConfirmation;
    private String email;
}
