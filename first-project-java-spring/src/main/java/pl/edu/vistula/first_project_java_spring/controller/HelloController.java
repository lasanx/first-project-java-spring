package pl.edu.vistula.first_project_java_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RestController
public class HelloController {

    @GetMapping(value ="/")
    public String hello() { return "Hello Vistula, in my first Spring controller."; }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(value="name", required = false, defaultValue ="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

//https://localhost:8080/greeting?name=Vistula
}