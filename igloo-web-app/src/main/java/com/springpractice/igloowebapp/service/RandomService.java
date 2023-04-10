package com.springpractice.igloowebapp.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomService {

    public String getRandomNumber() {
        return "" + new Random().nextInt(10000);
    }


}
