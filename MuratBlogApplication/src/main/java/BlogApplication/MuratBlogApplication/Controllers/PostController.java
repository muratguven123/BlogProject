package BlogApplication.MuratBlogApplication.Controllers;

import BlogApplication.MuratBlogApplication.Entities.Post;
import BlogApplication.MuratBlogApplication.Services.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
    private final PostService postService;
    public PostController(PostService postService) {
        this.postService = postService;
    }
//    @GetMapping
//    public List<Post> getPosts() {
//        return postService.getAllPosts();
//    }
    @PostMapping
    public Post addPost(@RequestBody Post post) {
        return postService.savePost(post);
    }
    @GetMapping
    public Post getPostByid(@RequestParam int id) {
        return postService.getPostById(id);
    }
    public void deletePostById(@RequestParam int id) {
        postService.deletePostById(id);
    }
    @PutMapping
    public Post updatePost(@RequestParam Integer id,@RequestBody Post post) {
        Post postToUpdate = postService.getPostById(id);
        if (postToUpdate != null) {
            postToUpdate.setTitle(post.getTitle());
            postToUpdate.setContent(post.getContent());
            postToUpdate.setAuthor(post.getAuthor());
            postToUpdate.setCreateDate(post.getCreateDate());
        }
        return postService.savePost(postToUpdate);
    }

}
