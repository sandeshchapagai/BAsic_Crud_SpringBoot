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
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "t-id")
     private  long tid;
     private String tname;
     private Integer tage;

     @OneToOne(cascade = CascadeType.ALL)
    private Student student;



}
