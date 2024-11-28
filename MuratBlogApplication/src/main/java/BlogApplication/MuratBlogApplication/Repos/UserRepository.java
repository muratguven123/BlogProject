package BlogApplication.MuratBlogApplication.Repos;

import BlogApplication.MuratBlogApplication.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
