package BlogApplication.MuratBlogApplication.Services;

import BlogApplication.MuratBlogApplication.Entities.Post;
import BlogApplication.MuratBlogApplication.Entities.User;
import BlogApplication.MuratBlogApplication.Repos.PostRepository;
import BlogApplication.MuratBlogApplication.Request.PostRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    private final PostRepository postRepository;
    private final UserService userService;

    public PostService(PostRepository postRepository, UserService userService) {
        this.postRepository = postRepository;
        this.userService = userService;
    }
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }
    public Post getPostById(Integer id) {
        return postRepository.findById(id).orElse(null);
    }
    public Post savePost(Post post) {
        return postRepository.save(post);
    }
    public void deletePost(Integer id) {
        postRepository.deleteById(id);
    }
    public Post createOnePost(PostRequest postRequest) {
        User user = userService.getUser((User) postRequest.getUserById());
        if(user==null) return null;
        Post toSave = new Post();
        toSave.setId(postRequest.getId());
        toSave.setAuthor(postRequest.getAuthor());
        toSave.setContent(postRequest.getContent());
        toSave.setTitle(postRequest.getTittle());
        toSave.setCreateDate(postRequest.getCreateDate());
        toSave.setUser(user);
        return postRepository.save(toSave);
    }
    public Post updatePost(PostRequest postRequest) {
        Optional<Post> post = postRepository.findById(postRequest.getId());
        if(post.isPresent()) {
            Post toUpdate = post.get();
            toUpdate.setAuthor(postRequest.getAuthor());
            toUpdate.setContent(postRequest.getContent());
            toUpdate.setTitle(postRequest.getTittle());
            toUpdate.setCreateDate(postRequest.getCreateDate());
            toUpdate.setUser((User) postRequest.getUserById());
        }
        return postRepository.save(post.get());
    }
    public void deletePostById(Integer id) {
        postRepository.deleteById(id);
    }

}
