package com.example.demo.myjpasitev4.dto;

import com.example.demo.myjpasitev4.PostV4;
import lombok.Getter;
import lombok.NoArgsConstructor;

// title, content, author를 받아서
// 우리의 Post로 만드는 역할
@Getter
@NoArgsConstructor
public class PostCreateRequestDto {
    private String title;
    private String content;
    private String author;

    public PostV4 toEntity() {
        return PostV4.builder()
                .title(this.getTitle())
                .content(this.getContent())
                .author(this.getAuthor())
                .build();
//        return new PostV4(title, content, author);
    }
}
