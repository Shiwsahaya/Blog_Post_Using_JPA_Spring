package net.blog.post.Repository;
import net.blog.post.model.Posts;
import org.springframework.data.repository.CrudRepository;
public interface PostsRepository extends CrudRepository<Posts, Integer > {
}
