package com.example.demo.myuser;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {
    List<User> findByNicknameAndAge(String nickname, Integer age);
    List<User> findByNickname(String nickname);
    List<User> findByAge(Integer age);
}
