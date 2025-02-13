package com.wikigroup.wikigroup.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationController {

    @GetMapping("/home")
    public String home() {
        return "projectDescription"; // Redirige a projectDescription.html
    }

    @GetMapping("/requirements")
    public String requirements() {
        return "Requirements"; // Redirige a Requirements.html
    }

    @GetMapping("/architecture")
    public String architecture() {
        return "projectArchitecture"; // Redirige a projectArchitecture.html
    }

    @GetMapping("/development")
    public String development() {
        return "development"; // Redirige a development.html
    }

    @GetMapping("/tests")
    public String tests() {
        return "tests"; // Redirige a tests.html
    }

    @GetMapping("/deploy")
    public String deploy() {
        return "deploy"; // Redirige a deploy.html
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact"; // Redirige a contact.html
    }

    @GetMapping("/about")
    public String about() {
        return "aboutUs"; // Redirige a aboutUs.html
    }
}

