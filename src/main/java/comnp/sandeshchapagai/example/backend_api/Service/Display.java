package comnp.sandeshchapagai.example.backend_api.Service;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class Display {
    @RequestMapping("/body")
    @ResponseBody
    public  String What(){
        return "Hello";
    }
}
