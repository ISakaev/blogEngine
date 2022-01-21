package ru.isakaev.blog_engine.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.isakaev.blog_engine.model.Tag2Post;

@Repository
public interface Tag2PostRepository extends JpaRepository<Tag2Post, Integer> {
}
