package com.wikigroup.wikigroup.Controllers;

import com.wikigroup.wikigroup.Entities.User;
import com.wikigroup.wikigroup.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class contactController {

    @Autowired
    private UserService userService;

    // Mostrar el formulario
    @GetMapping("/contact")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "contact";
    }

    // Procesar el formulario
    @PostMapping("/saveUser")
    public String saveUser(User user) {
        userService.saveUser(user);
        return "redirect:/contact";
    }
}