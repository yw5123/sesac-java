package com.example.demo.myuser.dto;

import com.example.demo.myuser.User;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserCreateRequestDto {

    @NotNull @Size(min = 3, max = 20)
    private String username;

    @NotNull @Email
    private String email;

    @NotNull @Size(min = 2,max = 10)
    private String nickname;

    @Min(value = 0) @Max(value = 150)
    private Integer age;

    public User toEntity() {
        return User.builder()
                .username(this.username)
                .email(this.email)
                .nickname(this.nickname)
                .age(this.age)
                .build();
    }
}
