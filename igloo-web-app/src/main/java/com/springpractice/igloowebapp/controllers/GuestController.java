package com.springpractice.igloowebapp.controllers;

import com.springpractice.igloowebapp.repositories.GuestRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/guests")
public class GuestController {

    private final GuestRepository guestRepository;

    public GuestController(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    @GetMapping
    public String getAllStaff(Model model) {
        model.addAttribute("guests", guestRepository.findAll());
        return "guests";
    }


}
