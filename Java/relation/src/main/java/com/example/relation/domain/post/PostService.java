package com.example.relation.domain.post;

import com.example.relation.domain.comment.Comment;
import com.example.relation.domain.comment.CommentRepository;
import com.example.relation.domain.post.dto.*;
import com.example.relation.domain.post.entity.Post;
import com.example.relation.domain.post.entity.PostTag;
import com.example.relation.domain.post.repository.PostRepository;
import com.example.relation.domain.post.repository.PostTagRepository;
import com.example.relation.domain.tag.Tag;
import com.example.relation.domain.tag.TagRepository;
import com.example.relation.domain.tag.dto.TagRequestDto;
import com.example.relation.global.exception.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PostService {
    private final PostRepository postRepository;
    private final CommentRepository commentRepository;
    private final TagRepository tagRepository;
    private final PostTagRepository postTagRepository;

    @Transactional
    public PostResponseDto createPost(PostCreateRequestDto requestDto) {
        Post post = postRepository.save(requestDto.toEntity());
        return PostResponseDto.from(post);
    }

    public List<PostListResponseDto> readPosts(){
        return postRepository.findAll().stream()
                .map(PostListResponseDto::from)
                .toList();
    }

    public PostWithCommentResponseDto readPostById(Long id){
        Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException());

        // 특정 post id를 가지고 있는 comments
        List<Comment> comments = commentRepository.findByPostId(id);

        return PostWithCommentResponseDto.from(post, comments);
    }

    public PostWithCommentResponseDtoV2 readPostByIdV2(Long id) {
        // post, comment를 한번에 가져온다
        Post post = postRepository.findByIdWithComment(id).orElseThrow(() -> new ResourceNotFoundException());
        // dto로 변경해서 return
        return PostWithCommentResponseDtoV2.from(post);
    }

    @Transactional
    public PostResponseDto updatePost(Long id, PostUpdateRequestDto requestDto){
        Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException());
        post.update(requestDto);

        return PostResponseDto.from(post);
    }

    @Transactional
    public void deletePost(Long id){
        Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException());

        postRepository.delete(post);
    }

    public List<PostListWithCommentCountResponseDto> readPostsWithCommentCount() {
        List<Object[]> results =  postRepository.findAllWithCommentCount();
        return results.stream()
                .map(result -> {
                    Post post = (Post) result[0];
                    Long commentCount = ((Number) result[1]).longValue();
                    return new PostListWithCommentCountResponseDto(
                            post.getId(),
                            post.getTitle(),
                            post.getCreatedAt(),
                            commentCount
                    );
                })
                .toList();
    }

    public List<PostListWithCommentCountResponseDto> readPostWithCommentCountDto() {
        return postRepository.findAllWithCommentCountDto();
    }

    @Transactional
    public void addTagToPost(Long id, TagRequestDto requestDto) {
        Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException());
        Tag tag = tagRepository.findByName(requestDto.getName()).orElseThrow(() -> new ResourceNotFoundException());

        PostTag postTag = new PostTag();

        postTag.addTag(tag);

        postTag.addPost(post);
        post.getPostTags().add(postTag);

        postTagRepository.save(postTag);
    }

    public PostWithCommentAndTagResponseDto readPostByIdWithCommentAndTag(Long id) {
//        Post post = postRepository.findByIdWithCommentAndTag(id).orElseThrow(() -> new ResourceNotFoundException());
//
//        return PostWithCommentAndTagResponseDto.from(post);

        Post postWithTag = postRepository.findByIdWithTag(id).orElseThrow(() -> new ResourceNotFoundException());
        List<Comment> comments = commentRepository.findByPostId(id);

        return PostWithCommentAndTagResponseDto.from(postWithTag, comments);
    }

    public PostWithCommentAndTagResponseDtoV2 readPostBtIdWithCommentAndTagV2(Long id) {
        Post post = postRepository.findByIdWithCommentAndTag(id).orElseThrow(() -> new ResourceNotFoundException());

        return PostWithCommentAndTagResponseDtoV2.from(post);
    }
}
