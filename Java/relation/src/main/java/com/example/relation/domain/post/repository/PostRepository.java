package com.example.relation.domain.post.repository;

import com.example.relation.domain.post.dto.PostListWithCommentCountResponseDto;
import com.example.relation.domain.post.entity.Post;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Long> {
    @Query("SELECT p FROM Post p LEFT JOIN p.comments WHERE p.id = :id")
    Optional<Post> findByIdWithComment(@Param("id") Long id);

    @Query("SELECT p FROM Post p LEFT JOIN FETCH p.comments WHERE p.id = :id")
    Optional<Post> findByIdWithCommentFetch(@Param("id") Long id);

    @Query("SELECT p FROM Post p LEFT JOIN FETCH  p.comments")
    List<Post> findAllWithCommentFetch();

    @EntityGraph(attributePaths = {"comments"})
    @Query("SELECT p FROM Post p")
    List<Post> findAllWithCommentEntityGraph();

    // @Query("SELECT p FROM Post p")은 findAll()과 같지만
    // ```
    //      @EntityGraph(attributePaths = {"comments"})
    //      List<Post> findAll()
    // ```
    // 라고 작성하면 post 리스트만 가져오려고 해도 entity graph도 가져오게 됨
    // +) List<Post> findAllWithComments(); 라고 +a(=EntityGraph)는 지우고 적는 게 더 좋을지도

//    @Query("SELECT p, COUNT(c) FROM Post p LEFT JOIN p.comments c GROUP BY p")
    @Query("SELECT p, COUNT(c) " +
            "FROM Post p " +
            "LEFT JOIN p.comments c " +
            "GROUP BY p")
    List<Object[]> findAllWithCommentCount();

    @Query("SELECT new com.example.relation.domain.post.dto.PostListWithCommentCountResponseDto(p.id, p.title, p.createdAt, COUNT(c)) " +
            "FROM Post p " +
            "LEFT JOIN p.comments c " +
            "GROUP BY p")
    List<PostListWithCommentCountResponseDto> findAllWithCommentCountDto();


    // 동작하지 x
    // jpa에서는 2개 이상의 fetch join 불가능 (특히 oneToMany일 때)
//    @Query("SELECT p FROM Post p " +
//            "LEFT JOIN FETCH p.comments c " +
//            "LEFT JOIN FETCH p.postTags pt " +
//            "LEFT JOIN FETCH pt.tag " +
//            "WHERE p.id = :id")

//    @Query("SELECT p FROM Post p " +
//            "LEFT JOIN p.comments c " +
//            "LEFT JOIN p.postTags pt " +
//            "LEFT JOIN pt.tag " +
//            "WHERE p.id = :id")

    // fetch와 조합하여 더 최적화 가능
    @Query("SELECT DISTINCT p FROM Post p " +
            "LEFT JOIN p.comments c " +
            "LEFT JOIN FETCH p.postTags pt " +
            "LEFT JOIN FETCH pt.tag " +
            "WHERE p.id = :id")
    Optional<Post> findByIdWithCommentAndTag(@Param("id") Long id);

    @Query("SELECT p FROM Post p " +
            "LEFT JOIN FETCH p.postTags pt " +
            "LEFT JOIN FETCH pt.tag " +
            "WHERE p.id = :id")
    Optional<Post> findByIdWithTag(@Param("id") Long id);
}
