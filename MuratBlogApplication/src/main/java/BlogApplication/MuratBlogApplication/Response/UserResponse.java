package BlogApplication.MuratBlogApplication.Response;

import lombok.Data;

@Data
public class UserResponse {
Integer id;
String name;
String email;
String passaword;
public UserResponse(Integer id, String name, String email, String password) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.passaword = password;
}

}
