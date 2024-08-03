package co.develope.deploy3.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/devname")
public class DevController {

    @Value("${devName}")
    private String devName;

    @GetMapping
    public String getName() {
        return devName;
    }
}
