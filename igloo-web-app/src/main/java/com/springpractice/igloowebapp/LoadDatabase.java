package com.springpractice.igloowebapp;

import com.springpractice.igloowebapp.models.Guest;
import com.springpractice.igloowebapp.repositories.GuestRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(GuestRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Guest("Bilbo", "Baggins", "103", "The Shire")));
            log.info("Preloading " + repository.save(new Guest("Frodo", "Baggins", "27", "The Shire")));
            log.info("Preloading " + repository.save(new Guest("Samwise", "Gamgee", "30", "The Shire")));
            log.info("Preloading " + repository.save(new Guest("Pippin", "Took", "25", "The Shire")));
            log.info("Preloading " + repository.save(new Guest("Meriadoc", "Brandybuck", "28", "The Shire")));
        };
    }
}
