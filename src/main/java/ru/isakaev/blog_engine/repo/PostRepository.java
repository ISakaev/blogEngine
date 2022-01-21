package ru.isakaev.blog_engine.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.isakaev.blog_engine.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

}
