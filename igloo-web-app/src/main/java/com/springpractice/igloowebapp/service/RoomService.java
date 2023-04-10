package com.springpractice.igloowebapp.service;

import com.springpractice.igloowebapp.models.Room;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {

    private static final List<Room> rooms = new ArrayList<>();

    static {
        for (int i = 1; i < 10; i++) {

            String availability = i % 2 == 0 ? "Yes" : "No";

            rooms.add(new Room(i, "Room " + i, "R" + i, availability));
        }
    }

    public List<Room> getAllRooms() {
        return rooms;
    }
}
