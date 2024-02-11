package comnp.sandeshchapagai.example.backend_api.Repository;

import comnp.sandeshchapagai.example.backend_api.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentREpo extends JpaRepository <Student,Integer>{
}
