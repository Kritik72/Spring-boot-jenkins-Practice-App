package com.deploy.war.FoodApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class FoodAppApplication {

	@GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "Building my First Sprint boot Application & deploying using jenkins");
        model.addAttribute("msg", "Application is Deployed on tomcat using jenkins ");
        return "index";
    }


	public static void main(String[] args) {
		SpringApplication.run(FoodAppApplication.class, args);
	}

}