package comnp.sandeshchapagai.example.backend_api.Model.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@Table(name = "student")
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @Column( name = "id")
    public int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Column(name = "name")
    public String name;
    public  String getName(){
        return  name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column( name = "class")
    public  String student_class;
       public  String getStudent_class(){
           return this.student_class;
       }
       public void setStudent_class(String student_class){
           this.student_class = student_class;
       }


}
