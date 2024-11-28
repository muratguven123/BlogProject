package BlogApplication.MuratBlogApplication.Services;

import BlogApplication.MuratBlogApplication.Entities.User;
import BlogApplication.MuratBlogApplication.Repos.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User getUser(User user){
        return userRepository.save(user);
    }
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    public User getUserById(Integer id){
        return userRepository.getReferenceById(id);
    }
    public void deleteUser(Integer id){
         userRepository.deleteById(id);
    }
    public User saveUser(User user){
        return userRepository.save(user);
    }

}
