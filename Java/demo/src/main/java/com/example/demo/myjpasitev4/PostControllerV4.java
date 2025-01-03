package com.example.demo.myjpasitev4;

import com.example.demo.myjpasitev4.dto.PostCreateRequestDto;
import com.example.demo.myjpasitev4.dto.PostListResponseDto;
import com.example.demo.myjpasitev4.dto.PostResponseDto;
import com.example.demo.myjpasitev4.dto.PostUpdateRequestDto;
import com.example.demo.myjpasitev4.exceptions.ResourceNotFoundException;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jpa/v4/posts")
@RequiredArgsConstructor
public class PostControllerV4 {
    private final PostServiceV4 postServiceV4;

//    @ExceptionHandler(ResourceNotFoundException.class)
//    public ResponseEntity<ApiResponse<Void>> handleResourceNotFound(ResourceNotFoundException ex) {
//        return ResponseEntity
//                .status(HttpStatus.NOT_FOUND)
//                .body(ApiResponse.error("resource not found", "NOT_FOUND"));
//    }

    // Post method / url / data
    @PostMapping
//    public PostResponseDto createPost(@RequestBody PostCreateRequestDto requestDto) {
//        return postServiceV4.createPost(requestDto);
//    }
    public ResponseEntity<ApiResponse<PostResponseDto>> createPost(@Valid @RequestBody PostCreateRequestDto requestDto) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(
                        ApiResponse.ok(
                                "게시글이 정상적으로 작성되었습니다.",
                                "CREATED",
                                postServiceV4.createPost(requestDto)
                        )
                );
    }

    @GetMapping
//    public List<PostListResponseDto> readPosts() {
//        return postServiceV4.readPosts();
//    }
    public ResponseEntity<ApiResponse<List<PostListResponseDto>>> readPosts(){
        List<PostListResponseDto> data = postServiceV4.readPosts();
        ApiResponse<List<PostListResponseDto>> response = ApiResponse.ok(data);

        return ResponseEntity.ok(response);

    }

    @GetMapping("/{id}")
//    public PostResponseDto readPostById(@PathVariable Long id) {
//        return postServiceV4.readPostById(id);
//    }
    public ResponseEntity<ApiResponse<PostResponseDto>> readPostById(@PathVariable Long id){
        return ResponseEntity.ok(ApiResponse.ok(postServiceV4.readPostById(id)));
    }

    // Put id 제목 내용 dto data
    @PutMapping("/{id}")
//    public PostResponseDto updatePost(@PathVariable Long id, @RequestBody PostUpdateRequestDto requestDto) {
//        return postServiceV4.updatePost(id, requestDto);
//    }
    public ResponseEntity<ApiResponse<PostResponseDto>> updatePost(@PathVariable Long id, @RequestBody PostUpdateRequestDto requestDto){
        return ResponseEntity.ok(ApiResponse.ok(postServiceV4.updatePost(id, requestDto)));
    }

    @DeleteMapping("/{id}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void deletePost(@PathVariable Long id) {
//        postServiceV4.deletePost(id);
//    }
    public ResponseEntity<ApiResponse<Void>> deletePost(@PathVariable Long id){
        postServiceV4.deletePost(id);
        return ResponseEntity.ok(
                ApiResponse.ok(
                        "게시글이 정상적으로 삭제되었습니다",
                        "DELETED",
                        null
                )
        );
    }
}
