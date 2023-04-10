package com.springpractice.igloowebapp.service;

import com.springpractice.igloowebapp.models.Guest;
import com.springpractice.igloowebapp.repositories.GuestRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GuestService {
    private final GuestRepository guestRepository;

    public GuestService(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    public List<Guest> getGuestByFirstName(String firstName) {
        List<Guest> guestList = guestRepository.findAll();
        List<Guest> outputList = new ArrayList<>();

        guestList.forEach(guest -> {
            if (guest.getFirstName().equals(firstName)) {
                outputList.add(guest);
            }
        });
        return outputList;
    }

    public List<Guest> getGuestByLastName(String lastName) {
        List<Guest> guestList = guestRepository.findAll();
        List<Guest> outputList = new ArrayList<>();

        guestList.forEach(guest -> {
            if (guest.getLastName().equals(lastName)) {
                outputList.add(guest);
            }
        });
        return outputList;
    }

    public Guest getGuestById(Long id) {
        /*
        List<Guest> guestList = guestRepository.findAll();

        for (Guest guest : guestList) {
            if (guest.getId().equals(id)) {
                return guest;
            }
        } */
        return guestRepository.findById(id).get();
    }

}
