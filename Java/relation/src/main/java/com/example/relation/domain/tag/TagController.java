package com.example.relation.domain.tag;

import com.example.relation.domain.tag.dto.TagRequestDto;
import com.example.relation.domain.tag.dto.TagResponseDto;
import com.example.relation.global.response.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tags")
@RequiredArgsConstructor
public class TagController {
    private final TagService tagService;

    @PostMapping
    public ResponseEntity<ApiResponse<TagResponseDto>> createTag(@RequestBody TagRequestDto requestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
                ApiResponse.ok(tagService.createService(requestDto))
        );
    }

    @GetMapping
    public ResponseEntity<ApiResponse<List<TagResponseDto>>> readTags() {
        return ResponseEntity.ok(ApiResponse.ok(tagService.readTags()));
    }
}