package comnp.sandeshchapagai.example.backend_api;

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
    @Column(name = "ID")
    @GeneratedValue
    private int id;


    @Column(name = "name")
    @GeneratedValue
    private int name;

    @Column(name = "Address")
    @GeneratedValue
    private int address;

    @Column(name = "classes")
    @GeneratedValue
    private int classes;


}
