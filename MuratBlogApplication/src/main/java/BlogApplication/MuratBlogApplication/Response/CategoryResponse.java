package BlogApplication.MuratBlogApplication.Response;

import lombok.Data;

@Data
public class CategoryResponse {
Integer id;
String name;
public CategoryResponse(Integer id, String name) {
    this.id = id;
    this.name = name;
}
}
