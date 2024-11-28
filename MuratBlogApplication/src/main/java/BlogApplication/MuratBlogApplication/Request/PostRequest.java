package BlogApplication.MuratBlogApplication.Request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class PostRequest {
private Integer id;

@Getter
@Setter
private String tittle;
private String content;
private String author;
private  String createDate;

public Object getUserById() {
    return id;
}

public void setUserById(Integer id) {
    this.id = id;
}



}
