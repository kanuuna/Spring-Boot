package com.springpractice.igloowebapp.controllers;

import com.springpractice.igloowebapp.models.Guest;
import com.springpractice.igloowebapp.repositories.GuestRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.rmi.ServerException;
import java.util.List;

@RestController
@RequestMapping("/api/guests")
public class GuestRestController {

    private final GuestRepository guestRepository;

    public GuestRestController(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    @GetMapping
    public List<Guest> getAllGuests() {
        return guestRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Guest> create(@RequestBody Guest newGuest) throws ServerException {
        Guest guest = guestRepository.save(newGuest);
        if (guest == null) {
            throw new ServerException("Guest data missing");
        } else {
            return new ResponseEntity<>(guest, HttpStatus.CREATED);
        }
    }

}
