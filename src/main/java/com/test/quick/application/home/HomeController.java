package com.test.quick.application.home;

import com.test.quick.application.configuration.QuickConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class HomeController {

    private final QuickConfiguration configuration;

    @Autowired
    public HomeController(QuickConfiguration configuration) {
        this.configuration = Objects.requireNonNull(configuration);
    }

    @RequestMapping("/")
    public String home() {
        return "Hello World! Configuration: " + configuration.toString();
    }
}
