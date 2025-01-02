package com.example.demo.myjpasitev4.dto;

import com.example.demo.myjpasitev4.PostV4;
import lombok.Getter;
import lombok.NoArgsConstructor;

// title, content, author를 받아서
// 우리의 Post로 만드는 역할
@Getter
//@NoArgsConstructor  // 필요하지만, 이 경우는 기본 생성자를 자동으로 만들어주기 때문에 필요 없음
public class PostUpdateRequestDto {
    private String title;
    private String content;
}
