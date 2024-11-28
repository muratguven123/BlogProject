package BlogApplication.MuratBlogApplication.Controllers;

import BlogApplication.MuratBlogApplication.Entities.User;
import BlogApplication.MuratBlogApplication.Services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
//    @GetMapping
//    public List<User> getUsers() {
//        return userService.getAllUsers();
//    }
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
    @GetMapping
    public User getUserById(@RequestParam("id") int id) {
        return userService.getUserById(id);
    }
    @PutMapping
    public User updateUser(@PathVariable Integer id,@RequestBody User user) {
        User userToUpdate = userService.getUserById(id);
        if(userToUpdate != null) {
            userToUpdate.setUsername(user.getUsername());
            userToUpdate.setPassword(user.getPassword());
            userToUpdate.setEmail(user.getEmail());
        }
        return userService.saveUser(userToUpdate);
    }
    public void deleteUser(@PathVariable Integer id) {
        userService.deleteUser(id);
    }
}
