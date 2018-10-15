package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Start {
    @RequestMapping(value="/")
    public String start(Model model) {
        return "start";
    }
    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("user", new User(0));
        return "login";
    }
    @PostMapping("/login")
    public String after_login(@ModelAttribute(value="id") User user) {
        String des="redirect:/information/"+Long.toString(user.getId());
        return des;
    }
}
