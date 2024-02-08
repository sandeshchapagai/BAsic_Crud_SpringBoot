package comnp.sandeshchapagai.example.backend_api.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import  lombok.Data;
import  lombok.NoArgsConstructor;


@Entity
@Data
@Table(name ="student")
@NoArgsConstructor
@AllArgsConstructor
public class Student {

@Id
    @Column(name = "id")
    @GeneratedValue
    private int id;


    @Column(name = "name")
    private String name;

}
