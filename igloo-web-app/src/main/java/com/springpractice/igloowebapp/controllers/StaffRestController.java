package com.springpractice.igloowebapp.controllers;

import com.springpractice.igloowebapp.models.Employee;
import com.springpractice.igloowebapp.service.StaffService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/staff")
public class StaffRestController {

    private final StaffService staffService;

    public StaffRestController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public List<Employee> getAllRooms() {
        return staffService.getAllStaff();
    }

}
