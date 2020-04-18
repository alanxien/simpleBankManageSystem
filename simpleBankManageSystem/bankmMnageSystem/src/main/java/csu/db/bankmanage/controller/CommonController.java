package csu.db.bankmanage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {

    @RequestMapping("/home")
    public String home(){
        return "index";
    }

    @RequestMapping("error-404")
    public String toPage404(){
        return "commons/404";
    }

    @RequestMapping("error-503")
    public String toPage503(){
        return "commons/503";
    }

}
