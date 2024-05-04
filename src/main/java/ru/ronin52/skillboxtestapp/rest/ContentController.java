package ru.ronin52.skillboxtestapp.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.ronin52.skillboxtestapp.dto.ContentDto;
import ru.ronin52.skillboxtestapp.service.ContentService;

@Controller
@RequestMapping("/content")
@RequiredArgsConstructor
public class ContentController {
    private final ContentService service;

    @PostMapping("/save")
    public String saveText(ContentDto content) {
        service.save(content);
        return "redirect:/app_title";
    }
}
