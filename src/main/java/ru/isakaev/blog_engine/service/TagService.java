package ru.isakaev.blog_engine.service;

import ru.isakaev.blog_engine.model.Tag;

import java.util.List;

public interface TagService {

    List<Tag> findAll();

    Tag getPostById(Integer id);

    void save(Tag tag);

    void deletePostById(Integer id);

    List<Tag> findAllStartWith(String query);

}
