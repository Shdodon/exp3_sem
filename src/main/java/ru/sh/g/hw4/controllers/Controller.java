package ru.sh.g.hw4.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@org.springframework.stereotype.Controller
@RequestMapping
public class Controller {

    @GetMapping("/task1")
    public String helloWorld() {
        return "task1";
    }

    @GetMapping("/task2")
    public String whatIsTheDate(Model model) {
        model.addAttribute("date", LocalDate.now().toString());
        return "task2";
    }
}
