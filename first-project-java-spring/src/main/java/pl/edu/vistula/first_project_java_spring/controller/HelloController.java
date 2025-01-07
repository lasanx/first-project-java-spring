package pl.edu.vistula.first_project_java_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping(value = "/")
    public String hello() {
        return "Hello Vistula, in my first Spring controller.";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        String imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSzQjL8iWMsDjU_yYlke6aSkmi-WB1QUUso8Q&s";
        model.addAttribute("imageUrl", imageUrl);
        return "greeting";
    }
}
