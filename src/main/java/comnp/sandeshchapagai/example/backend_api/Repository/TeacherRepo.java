package comnp.sandeshchapagai.example.backend_api.Repository;
import comnp.sandeshchapagai.example.backend_api.Model.Entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TeacherRepo extends JpaRepository <Teacher,Integer>{
}
