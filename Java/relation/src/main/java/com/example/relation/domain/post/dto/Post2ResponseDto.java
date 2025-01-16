package com.example.relation.domain.post.dto;

import com.example.relation.domain.post.entity.Post2;
import com.example.relation.domain.user.dto.response.UserResponseDto;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Post2ResponseDto {
    private final Long id;
    private final String title;
    private final String content;
    private final UserResponseDto author;

    public static Post2ResponseDto from(Post2 entity) {
        return Post2ResponseDto.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .content(entity.getContent())
                .author(
                        UserResponseDto.from(entity.getAuthor())
                )
                .build();
    }
}
