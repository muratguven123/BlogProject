package BlogApplication.MuratBlogApplication.Services;

import BlogApplication.MuratBlogApplication.Entities.Category;
import BlogApplication.MuratBlogApplication.Repos.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    private final CategoryRepository CategoryRepository;
    public CategoryService(CategoryRepository CategoryRepository) {
        this.CategoryRepository = CategoryRepository;
    }
    public List<Category> findAll() {
        return CategoryRepository.findAll();
    }
    public Optional<Category> findById(Integer id) {
        return CategoryRepository.findById(id);
    }
    public Category save(Category category) {
        return CategoryRepository.save(category);
    }
    public void delete(Category category) {
        CategoryRepository.delete(category);
    }

}
