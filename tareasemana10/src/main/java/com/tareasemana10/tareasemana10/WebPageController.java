package com.tareasemana10.tareasemana10;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/intro")
public class WebPageController {
    @GetMapping()
    public String index() {
        return "tareapage";
    }
}
