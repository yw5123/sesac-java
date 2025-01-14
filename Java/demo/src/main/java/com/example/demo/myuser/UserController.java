package com.example.demo.myuser;

import com.example.demo.myuser.dto.UserCreateRequestDto;
import com.example.demo.myuser.dto.UserListResponseDto;
import com.example.demo.myuser.dto.UserResponseDto;
import com.example.demo.myuser.dto.UserUpdateRequestDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public ResponseEntity<ApiResponse<List<UserListResponseDto>>> readUsers() {
        List<UserListResponseDto> data = userService.readUsers();
        ApiResponse<List<UserListResponseDto>> response = ApiResponse.ok(data);

        return ResponseEntity.ok(response);
    }

    @GetMapping("/{username}")
    public ResponseEntity<ApiResponse<UserResponseDto>> readUserByUsername(@PathVariable String username) {
        return ResponseEntity.ok(ApiResponse.ok(userService.readUserByUsername(username)));
    }

    @PutMapping("/{username}")
    public ResponseEntity<ApiResponse<UserResponseDto>> updateUser(@PathVariable String username, @RequestBody UserUpdateRequestDto requestDto) {
        return ResponseEntity.ok(ApiResponse.ok(userService.updateUser(username, requestDto)));
    }

    @DeleteMapping("/{username}")
    public ResponseEntity<ApiResponse<Void>> deleteUser(@PathVariable String username) {
        userService.deleteUser(username);
        return ResponseEntity.ok(
                ApiResponse.ok(
                        "사용자가 정상적으로 삭제되었습니다.",
                        "DELETED",
                        null
                )
        );
    }

    // 특정 닉네임을 가진 사용자 조회
    // 특정 나이의 사용자 조회
    @GetMapping("/search")
    public ResponseEntity<ApiResponse<List<UserResponseDto>>> searchUsers(
            @RequestParam(required = false) String nickname,
            @RequestParam(required = false) Integer age
    ) {
        List<UserResponseDto> data = userService.searchUsers(nickname, age);
        ApiResponse<List<UserResponseDto>> response = ApiResponse.ok(data);

        return ResponseEntity.ok(response);
    }
}
