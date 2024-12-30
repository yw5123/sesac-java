package com.example.demo.mysite.postMVC;

import com.example.demo.mysite.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
//    PostRepository postRepository = new PostRepository();

    // DI
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post createPost(Post newPost) {
//        // validate 체크를 한 후에 비즈니스 로직 처리
//        String title = newPost.getTitle();
//        String content = newPost.getContent();
//
//        if (title == null || title.isBlank()) {
//            throw new IllegalArgumentException("title을 입력하세요.");
//        }
//
//        if (content == null || content.isBlank()) {
//            throw new IllegalArgumentException("content를 입력해주세요.");
//        }
        validatePostData(newPost);

        return postRepository.save(newPost);
    }

    public List<Post> readPosts() {
        return postRepository.findAll();
    }

    public Post readPostById(Long id) {
        Post post = postRepository.findById(id);

//        if (post == null) {
//            throw new IllegalArgumentException("없는 id입니다.");
//        }
        checkPostIsNull(post);

        return post;
    }

    public Post updatePost(Long id, Post updatedPost) {
        Post post = postRepository.findById(id);

//        if (post == null) {
//            throw new IllegalArgumentException("없는 id입니다.");
//        }
        checkPostIsNull(post);

        validatePostData(post);

        return postRepository.modify(id, updatedPost);
    }

    public void deletePost(Long id) {
        Post post = postRepository.findById(id);

        checkPostIsNull(post);

        postRepository.delete(post);
    }

    public void checkPostIsNull(Post post) {
        if (post == null) {
            throw new IllegalArgumentException("없는 id입니다.");
        }
    }

    public void validatePostData(Post post) {
        String title = post.getTitle();
        String content = post.getContent();

        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("title을 입력하세요.");
            // 에러가 throw될 경우 상위에서 try catch를 해야 함 그렇지 않으면 프로그램이 종료 (현재는 종료됨)
            //
        }

        if (content == null || content.isBlank()) {
            throw new IllegalArgumentException("content를 입력해주세요.");
        }
    }
}
