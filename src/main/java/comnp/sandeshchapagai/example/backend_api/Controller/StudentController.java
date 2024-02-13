package comnp.sandeshchapagai.example.backend_api.Controller;
import comnp.sandeshchapagai.example.backend_api.Model.Entity.Student;
import comnp.sandeshchapagai.example.backend_api.Service.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentServices studentServices;

    @PostMapping("/addStudent")
    public String postDetails(@RequestBody Student student) {
        studentServices.saveDetails(student);
        return  "Posted";
    }

    @GetMapping("/getStudent")
        public List<Student> getDetails () {
        return studentServices.getAllDetails();
        }

    @GetMapping("/getStudent/{id}")
    public Student getStudentByID  (@PathVariable int id) {
        return studentServices.getStudentById(id);
    }


    @PutMapping("/editStudent")
    public String updateStudent(@RequestBody Student student) {
        studentServices.updateStudent(student);
        return  "Posted";
    }

    @DeleteMapping("/delete/{id}")
    public  String deleteStudent(@PathVariable int id ){
        return  studentServices.deleteStudent(id);
    }
    }


