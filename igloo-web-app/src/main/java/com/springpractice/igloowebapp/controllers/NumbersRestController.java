package com.springpractice.igloowebapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/api/numbers")
public class NumbersRestController {

    @GetMapping
    public List<Integer> getAllNumbers() {
        return IntStream.range(1, 101).boxed().collect(Collectors.toList());
    }

}
