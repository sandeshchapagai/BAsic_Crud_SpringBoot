package comnp.sandeshchapagai.example.backend_api.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/")
    public String getHome(){
        return "k xX";
    }
    @GetMapping("/person")
    public Person getPerson(){
        Person p = new Person();
        p.setName("Hari Bahadur");
        p.setAge(66);
        p.getName();
        p.getAge();
        return p;
    }


    class Person{
        private  String name;
        private  Integer age;


        public String getName(){
            return this.name;
        }

        public Integer getAge(){
            return this.age;
        }

        public  String setName(String newNAme){
            this.name = newNAme;
            return  this.name;
        }
        public Integer setAge(Integer newAge){
            this.age = newAge;
            return  this.age;
        }
    }
}

