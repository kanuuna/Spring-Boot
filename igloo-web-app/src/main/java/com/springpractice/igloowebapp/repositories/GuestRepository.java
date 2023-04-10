package com.springpractice.igloowebapp.repositories;

import com.springpractice.igloowebapp.models.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Long> {
}
