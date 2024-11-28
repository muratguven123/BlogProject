package BlogApplication.MuratBlogApplication.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jdk.jfr.MemoryAddress;
import lombok.*;
import org.springframework.data.annotation.Id;

@Entity
@Table(name="post")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Post {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private Integer id;

    private String title;
    private String content;
    private String author;
    private String createDate;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false) // Foreign key column in Post table
    private Category category;

    public Post setUser(User user){
        return setUser(user);

    }




}
