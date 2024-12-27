package com.example.demo.mysite.postMVC;

import com.example.demo.mysite.Post;

import java.util.ArrayList;
import java.util.List;

public class PostRepository {
    private List<Post> posts = new ArrayList<>();
    private Long id = 0L;

    // 저장
    public Post save(Post newPost) {
        Post post = new Post(++id, newPost.getTitle(), newPost.getContent());
        posts.add(post);

        return post;
    }

    public List<Post> findAll() {
        return posts;
    }

    public Post findById(Long id) {
        for (Post post : posts) {
            if (post.getId().equals(id)) {
                return post;
            }
        }
        return null;
    }

    public Post modify(Long id, Post updatedPost) {
        for (Post post : posts) {
            if (post.getId().equals(id)) {
                post.setTitle(updatedPost.getTitle());
                post.setContent(updatedPost.getContent());
                return post;
            }
        }
        return null;
    }

    public void delete(Post post) {
        posts.remove(post);
    }
}
