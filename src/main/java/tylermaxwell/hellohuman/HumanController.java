package tylermaxwell.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {

    @RequestMapping("/")
    public String index(@RequestParam(defaultValue = "Human", required = false) String fname, @RequestParam(defaultValue = "", required = false) String lname ){
        return "<h1>Hello " + fname + " " + lname + "</h1>";
    }
}
