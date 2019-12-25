package net.blog.post.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostsService {

    @Autowired
    private PostsRepository repo;

    public List<Posts>listAll(){
        return (List<Posts>)repo.findAll();
    }

    public void save(Posts posts) {
        repo.save(posts);
    }
    public Posts get(int id){
        Optional<Posts>result=repo.findById(id);
        return result.get();
    }
    public void delete(int id){
        repo.deleteById(id);
    }
}
