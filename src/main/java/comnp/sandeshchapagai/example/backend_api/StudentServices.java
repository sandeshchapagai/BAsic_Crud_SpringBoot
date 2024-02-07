package comnp.sandeshchapagai.example.backend_api;

import comnp.sandeshchapagai.example.backend_api.Repository.StudentREpo;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentServices {

    @Autowired

    private StudentREpo studentREpo;
    public Student saveDetails(Student student){
        return studentREpo.save(student);
    }

}
