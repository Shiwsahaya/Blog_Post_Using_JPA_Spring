package net.blog.post.model;
import org.springframework.data.repository.CrudRepository;
public interface PostsRepository extends CrudRepository<Posts, Integer > {
}
