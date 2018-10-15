package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("user", new User(User.nextid));
        return "register";
    }
    @PostMapping("/register")
    public String after_register(@ModelAttribute(value="user") User user) {
        userRepository.save(user);
        User.nextid+=1;
        String des="redirect:/information/"+Long.toString(user.getId());
        return des;
    }
    @GetMapping("/information/{id}")
    public String information(Model model,@PathVariable Long id) {
        model.addAttribute("user", userRepository.findByid(id));
        return "information";
    }
}
