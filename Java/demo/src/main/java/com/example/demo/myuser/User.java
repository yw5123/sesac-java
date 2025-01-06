package com.example.demo.myuser;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User extends BaseTimeEntity {
    @Id
    @Column(nullable = false, unique = true, length = 20, updatable = false)
    private String username;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, length = 10)
    private String nickname;

    @Column
    private Integer age;

    @Column(nullable = false, columnDefinition = "boolean default true")
    private Boolean isActive = true;

    @Builder
    public User(String username, String email, String nickname, Integer age) {
        this.username = username;
        this.email = email;
        this.nickname = nickname;
        this.age = age;
    }
}

// ### User Entity의 필드
//
// - username (필수, 중복 불가, 3-20자 제한, 수정 불가)
// - email (필수, 이메일 형식 검증, 중복 불가)
// - nickname (필수, 중복 가능, 2-10자 제한)
// - age (0-150 사이의 정수)
// - isActive (필수, boolean, 기본값 : true)
//    - entity 정의할 때 기본값 작성
// - createdAt
// - updatedAt