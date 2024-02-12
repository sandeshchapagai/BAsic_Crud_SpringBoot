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

    public void saveDetails(Student student) {
        studentREpo.save(student);
    }


    public List<Student> getAllDetails() {
        return studentREpo.findAll();
    }


    public Student getStudentById(int id) {
        return studentREpo.findById(id).orElse(null);
    }

   public  String deleteStudent(int id){
        studentREpo.deleteById(id);
        return "Product deleted !!"+id;
   }

    public void updateStudent(Student student) {
        // Retrieve the existing student from the database
        Student existingStudent = studentREpo.findById(student.getId()).orElse(null);
        if (existingStudent != null) {

            existingStudent.setName(student.getName());
            existingStudent.setStudent_class(student.getStudent_class());
            studentREpo.save(existingStudent);
        } else {
            System.out.println("Student with ID " + student.getId() + " not found.");
        }
    }

}
