package BlogApplication.MuratBlogApplication.Request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class CategoryRequest {
    private Integer id;
    @Getter
    @Setter
    private String name;
}
