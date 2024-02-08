package comnp.sandeshchapagai.example.backend_api.Controller;

import comnp.sandeshchapagai.example.backend_api.Entity.Student;
import comnp.sandeshchapagai.example.backend_api.Repository.StudentREpo;
import comnp.sandeshchapagai.example.backend_api.Service.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
@Autowired
    private StudentServices studentServices;
@PostMapping("/addStudent")
    public Student postDetails(@RequestBody Student student){
    return  studentServices.saveDetails(student);
}
}

