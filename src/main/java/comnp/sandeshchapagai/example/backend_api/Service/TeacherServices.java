package comnp.sandeshchapagai.example.backend_api.Service;

import comnp.sandeshchapagai.example.backend_api.Model.Entity.Teacher;
import comnp.sandeshchapagai.example.backend_api.Repository.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServices {

    @Autowired
    private TeacherRepo teacherRepository;

    public <TeacherID> String addTeacher(TeacherID teacherID) {
        // Basic validation
        if (teacherID == null) {
            return "TeacherID cannot be null.";
        }

        // Create a new Teacher entity
        Teacher teacher = new Teacher();
//        teacher.setTid(11);

        // Save the new teacher to the database
        teacherRepository.save(teacher);

        // Return a success message
        return "Teacher added successfully with ID: " + teacherID;
    }

    public <LoginMessage, LoginDTO> LoginMessage loginTeacher(LoginDTO loginDTO) {
        return (LoginMessage) "Login succesfully";
    }
}
