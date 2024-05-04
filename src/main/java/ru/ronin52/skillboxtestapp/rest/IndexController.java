package ru.ronin52.skillboxtestapp.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.ronin52.skillboxtestapp.dto.ContentDto;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "redirect:/app_title";
    }

    @GetMapping("/app_title")
    public String appTitle(Model model) {
        model.addAttribute("content", new ContentDto());
        return "index";
    }
}
