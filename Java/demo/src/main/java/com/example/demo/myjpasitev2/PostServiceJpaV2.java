package com.example.demo.myjpasitev2;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceJpaV2 {
    private final PostRepositoryJpaV2 postRepositoryJpaV2;

//    public PostServiceJpaV2(PostRepositoryJpaV2 postRepositoryJpaV2) {
//        this.postRepositoryJpaV2 = postRepositoryJpaV2;
//    }

    public PostJpaV2 createPost(PostJpaV2 post) {
        return postRepositoryJpaV2.save(post);
    }

    public List<PostJpaV2> readPosts() {
        return postRepositoryJpaV2.findAll();
    }

    public PostJpaV2 readPostById(Long id) {
        return postRepositoryJpaV2.findById(id);
    }

    public PostJpaV2 updatePost(Long id, PostJpaV2 updatedPost) {
        return postRepositoryJpaV2.update(id, updatedPost);
    }

    public void deletePost(Long id) {
        postRepositoryJpaV2.delete(id);
    }
}
