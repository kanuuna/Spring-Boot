package com.springpractice.igloowebapp.service;

import com.springpractice.igloowebapp.models.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StaffService {

    private static final List<Employee> staff = new ArrayList<>();

    static {
        staff.add(new Employee("IH1", "John", "Smith", "Janitor"));
        staff.add(new Employee("IH2", "Beth", "Johnson", "Greeter"));
        staff.add(new Employee("IH3", "Olaf", "Gustafson", "Security"));
    }

    public List<Employee> getAllStaff() {
        return staff;
    }
}
