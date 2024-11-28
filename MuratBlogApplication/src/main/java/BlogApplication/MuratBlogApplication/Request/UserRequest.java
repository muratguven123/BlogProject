package BlogApplication.MuratBlogApplication.Request;

import lombok.Data;
import lombok.NonNull;
import org.aspectj.bridge.IMessage;

@Data
public class UserRequest {
 private Integer id;

private String username;

private String password;

private String email;

}
