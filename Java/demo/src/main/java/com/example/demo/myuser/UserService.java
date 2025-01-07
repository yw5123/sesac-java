package com.example.demo.myuser;

import com.example.demo.myjpasitev4.exceptions.ResourceNotFoundException;
import com.example.demo.myuser.dto.UserCreateRequestDto;
import com.example.demo.myuser.dto.UserListResponseDto;
import com.example.demo.myuser.dto.UserResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    // Create
    @Transactional
    public UserResponseDto createUser(UserCreateRequestDto requestDto) {
        User user = userRepository.save(requestDto.toEntity());
        return UserResponseDto.from(user);
    }

    // Read
    public List<UserListResponseDto> readUsers() {
        return userRepository.findAll().stream()
                .map(UserListResponseDto::from)
                .toList();
    }

    public UserResponseDto readUserByUsername(String username) {
        User user = userRepository.findById(username)
                .orElseThrow(() -> new ResourceNotFoundException());

        return UserResponseDto.from(user);
    }
}
