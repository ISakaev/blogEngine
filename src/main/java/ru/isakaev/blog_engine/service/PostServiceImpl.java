package ru.isakaev.blog_engine.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.isakaev.blog_engine.model.Post;
import ru.isakaev.blog_engine.repo.PostRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;


    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    @Override
    public Post getPostById(Integer id) {
        return postRepository.getById(id);
    }

    @Override
    public void save(Post post) {
        Post newPost = postRepository.save(post);
    }

    @Override
    public void deletePostById(Integer id) {
        postRepository.deleteById(id);
    }
}
