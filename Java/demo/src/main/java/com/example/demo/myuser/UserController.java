package com.example.demo.myuser;

import com.example.demo.myuser.dto.UserCreateRequestDto;
import com.example.demo.myuser.dto.UserResponseDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jpa/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public ResponseEntity<ApiResponse<UserResponseDto>> createUser(@Valid @RequestBody UserCreateRequestDto requestDto) {
        UserResponseDto user = userService.createUser(requestDto);
        ApiResponse<UserResponseDto> response = ApiResponse.ok("사용자가 성공적으로 생성되었습니다.", "CREATED", user);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
