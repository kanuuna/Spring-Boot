package com.springpractice.igloowebapp.models;

public class Room {
    private String number;
    private String name;
    private String available;
    private long id;

    public Room() {
    }

    public Room(long id, String number, String name, String available) {
        this.number = number;
        this.name = name;
        this.available = available;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }
}
