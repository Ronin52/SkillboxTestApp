package ru.ronin52.skillboxtestapp.rest;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.ronin52.skillboxtestapp.dto.ContentDto;

@Controller
@Data
public class IndexController {
    @Value("${content.max_length}")
    private Integer maxLength;
    @Value("${content.min_length}")
    private Integer minLength;
    @GetMapping("/")
    public String index() {
        return "redirect:/app_title";
    }

    @GetMapping("/app_title")
    public String appTitle(Model model) {
        model.addAttribute("content", new ContentDto());
        model.addAttribute("max_length", maxLength);
        model.addAttribute("min_length", minLength);
        return "index";
    }
}
