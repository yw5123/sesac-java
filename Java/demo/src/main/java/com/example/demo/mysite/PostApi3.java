package com.example.demo.mysite;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v3/posts")    // 클래스 레벨에 선언하여 중복을 줄일 수 있음
public class PostApi3 {
    // Post class의 instance, 즉 게시글을 넣음
    // List 생성
    List<Post> posts = new ArrayList<>();
    private Long id = 0L;   // 게시글 생성에서 id 생성을 위한 장치(나중에는 없어도 되는데 실습을 위해 필요)

    {
        // instance가 생성되었을 때 한번 실행
        // 초기값을 넣을 때 사용
        posts.add(new Post(++id, "초기 제목", "초기 내용"));
    }

    // create
    // post / 내용 / url
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // HTTP 응답 상태 코드 지정
    public Post createPost(@RequestBody Post newPost) {
        String title = newPost.getTitle();
        String content = newPost.getContent();

        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("title을 입력하세요.");
        }

        if (content == null || content.isBlank()) {
            throw new IllegalArgumentException("content를 입력해주세요.");
        }

        Post post = new Post(++id, title, content);
        posts.add(post);

        return post;
    }

    // read
    // posts / get
    @GetMapping
    public List<Post> readPosts() {
        return posts;
    }

    // read - 단일 조회
    @GetMapping("/{id}")
    public Post readPostById(@PathVariable Long id){
        // posts에서 post를 가져오기
        for (Post post : posts) {
            if (post.getId().equals(id)) {
                return post;
            }
        }
        return null;
    }

    // update
    // 변경 내용 / id / url
    @PutMapping("/{id}")
    public Post updatePost(@PathVariable Long id, @RequestBody Post updatedPost) {
        String newTitle = updatedPost.getTitle();
        String newContent = updatedPost.getContent();

        for (Post post : posts) {
            if (post.getId().equals(id)) {
                post.setTitle(newTitle);
                post.setContent(newContent);
                return post;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePost(@PathVariable Long id) {
        Post removedPost = null;
        for (Post post : posts) {
            if (post.getId().equals(id)) {
                removedPost = post;
                break;
            }
        }
        posts.remove(removedPost);
    }

    @GetMapping("/paged")
    public List<Post> getPagedPosts(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int size){

        // 1. 페이지네이션을 위한 더미데이터 추가
        for (int i = 1; i <= 20; i++) {
            String title = "제목 " + i;
            String content = "내용 " + i;
            Post post = new Post(++id, title, content);
            posts.add(post);
        }

        // 2. 시작 인덱스와 끝 인덱스 계산
        int startIndex = (page - 1) * size;
        int endIndex = Math.min(startIndex + size, posts.size());

        // 3. 페이지에 해당하는 데이터만 추출
        return posts.subList(startIndex, endIndex);
    }
}
