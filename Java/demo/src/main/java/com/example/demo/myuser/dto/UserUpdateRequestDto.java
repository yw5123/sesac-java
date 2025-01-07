package com.example.demo.myuser.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;

@Getter
public class UserUpdateRequestDto {

    @Email
    private String email;

    @Size(min = 2,max = 10)
    private String nickname;
}
