package BlogApplication.MuratBlogApplication.Response;

import lombok.Data;

@Data
public class PostResponse {
Integer id;
String title;
String body;
String author;
String date;
public PostResponse(Integer id, String title, String body, String author, String date) {
    this.id = id;
    this.title = title;
    this.body = body;
    this.author = author;
    this.date = date;
}

}
