package comnp.sandeshchapagai.example.backend_api.Service;

import comnp.sandeshchapagai.example.backend_api.Repository.StudentREpo;
import comnp.sandeshchapagai.example.backend_api.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices {

    @Autowired

    private StudentREpo studentREpo;
    public Student saveDetails(Student student){
        return studentREpo.save(student);
    }
    public List<Student> getAllDetails(){
        return studentREpo.findAll();
    }


}
