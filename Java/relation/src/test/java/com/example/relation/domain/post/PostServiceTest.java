package com.example.relation.domain.post;

import com.example.relation.domain.comment.Comment;
import com.example.relation.domain.comment.CommentRepository;
import com.example.relation.domain.post.dto.PostCreateRequestDto;
import com.example.relation.domain.post.dto.PostResponseDto;
import com.example.relation.domain.post.dto.PostWithCommentResponseDtoV2;
import com.example.relation.domain.post.entity.Post;
import com.example.relation.domain.post.repository.PostRepository;
import com.example.relation.global.exception.ResourceNotFoundException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.BDDMockito.*;


@ExtendWith(MockitoExtension.class)
class PostServiceTest {

    @Mock
    private PostRepository postRepository;

    @Mock
    private CommentRepository commentRepository;

    @InjectMocks
    private PostService postService;

    @Test
    void createPost_성공() {
        // given
        PostCreateRequestDto requestDto = new PostCreateRequestDto(
                "테스트 제목",
                "테스트 내용",
                "테스트 작성자"
        );

        Post post = requestDto.toEntity();

        given(postRepository.save(any(Post.class)))
                .willReturn(post);

        // when
        PostResponseDto result = postService.createPost(requestDto);

        // then
        // result가 title로 "테스트 제목"
        Assertions.assertThat(result.getTitle())
                .isEqualTo("테스트 제목");

        // result가 content로 "테스트 내용"
        Assertions.assertThat(result.getContent())
                .isEqualTo("테스트 내용");

        // repository의 save를 호출한 게 맞는지 확인
        verify(postRepository).save(any(Post.class));
    }

    @Test
    void readPostByIdV2_성공() {
        // given
        Long postId = 1L;

        Post post = Post.builder()
                .title("테스트 제목")
                .content("테스트 내용")
                .author("테스트 작성자")
                .build();

        Comment comment = Comment.builder()
                .content("댓글 내용")
                .post(post)
                .build();

        // postRepository에 있는 findByIdWithComment를 호출했을 때, post가 comment와 같이 전달
        given(postRepository.findByIdWithComment(postId))
                .willReturn(Optional.of(post));

        // when
        PostWithCommentResponseDtoV2 result = postService.readPostByIdV2(postId);

        // then
        assertThat(result).isNotNull();
        assertThat(result.getTitle()).isEqualTo("테스트 제목");
        assertThat(result.getContent()).isEqualTo("테스트 내용");
        assertThat(result.getComments()).hasSize(1);
        assertThat(result.getComments().get(0).getContent()).isEqualTo("댓글 내용");
        verify(postRepository).findByIdWithComment(postId);
    }

    @Test
    void readPostById_실패_게시글이_없는_경우() {
        // given
        Long postId = 999L;
        given(postRepository.findById(postId))
                .willReturn(Optional.empty());

        // when & then
        Assertions.assertThatThrownBy(() -> postService.readPostById(postId))
                .isInstanceOf(ResourceNotFoundException.class);

        verify(postRepository).findById(postId);
        verify(commentRepository, never()).findByPostId(postId);
    }
}