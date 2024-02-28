package comnp.sandeshchapagai.example.backend_api.Model.Entity;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Transactional
@Data
@Table(name = "teacher")
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
    @Id
    @Column(name = "t-id")
    @GeneratedValue(strategy = GenerationType.AUTO)
     private  int tid;

    @Column(name = "tname")
     private String tname;

    @Column(name = "email")
     private String email;

    @Column(name = "password")
    private  String password;


}
