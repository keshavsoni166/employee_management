package com.example.employee_management.service;

import com.example.employee_management.model.Employee;
import com.example.employee_management.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repo;

    public Employee save(Employee e) {
        return repo.save(e);
    }

    public List<Employee> getAll() {
        return repo.findAll();
    }

    public Employee getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Employee update(Long id, Employee newEmp) {
        return repo.findById(id).map(emp -> {
            emp.setName(newEmp.getName());
            emp.setDepartment(newEmp.getDepartment());
            emp.setSalary(newEmp.getSalary());
            return repo.save(emp);
        }).orElse(null);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}