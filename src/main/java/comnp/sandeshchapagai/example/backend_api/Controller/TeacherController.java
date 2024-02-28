package comnp.sandeshchapagai.example.backend_api.Controller;


import comnp.sandeshchapagai.example.backend_api.Model.Entity.Teacher;
import comnp.sandeshchapagai.example.backend_api.Service.TeacherServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@CrossOrigin
@RequestMapping(path = "/api/v1/teacher")
public class TeacherController<TeacherID> {

@Autowired
    private TeacherServices teacherServices;

@PostMapping("/save")
    public String saveTeacher(@RequestBody TeacherID teacherID)
{
    return teacherServices.addTeacher(teacherID);
}

@PostMapping("/login")
    public <LoginDTO, LoginMessage> ResponseEntity<?> loginTeacher(@RequestBody LoginDTO loginDTO)
{
    LoginMessage loginMessage=teacherServices.loginTeacher(loginDTO);
    return ResponseEntity.ok(loginMessage);
}



}
