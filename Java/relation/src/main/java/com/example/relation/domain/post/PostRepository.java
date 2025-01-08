package com.example.relation.domain.post;

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
}
