package ru.isakaev.blog_engine.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.isakaev.blog_engine.model.Tag;

public interface TagRepository extends JpaRepository<Tag, Integer> {

}
