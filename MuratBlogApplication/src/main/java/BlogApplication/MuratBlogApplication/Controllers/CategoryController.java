package BlogApplication.MuratBlogApplication.Controllers;

import BlogApplication.MuratBlogApplication.Entities.Category;
import BlogApplication.MuratBlogApplication.Services.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/category")
public class CategoryController {
    private final CategoryService categoryService;
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
//    @GetMapping
//    public List<Category> getAllCategories() {
//        return categoryService.findAll();
//    }
    @GetMapping
    public Optional<Category> getCategoryById(@RequestParam Integer id) {
        return categoryService.findById(id);
    }
    @PostMapping
    public Category createCategory(@RequestBody Category category) {
        return categoryService.save(category);
    }
    @PutMapping
    public Category updateCategory(@RequestParam Integer id,@RequestBody Category category) {
        Category categoryToUpdate = new Category();
        if (category.getId() != null) {
            categoryToUpdate.setId(id);
            categoryToUpdate.setName(category.getName());
        }
        return categoryService.save(categoryToUpdate);
    }
    public void deleteCategory(@PathVariable Category id) {
        categoryService.delete(id);
    }


}
