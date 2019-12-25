package net.blog.post.service;
import net.blog.post.model.Posts;
import org.springframework.data.repository.CrudRepository;
public interface PostsRepository extends CrudRepository<Posts, Integer > {
}
