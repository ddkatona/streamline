package hu.ddkatona.streamline.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestController2 {

    int i = 0;

    @GetMapping("/data")
    public String index(Model model) {
        i++;
        return Integer.toString(i);
    }

}
