package ct.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {


    @RequestMapping(value = { "/", "index" })
    public String welcome() {

        return "index";
    }
}
