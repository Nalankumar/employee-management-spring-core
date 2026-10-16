package spring.practice.storage;

import spring.practice.entities.Employee;

import java.util.List;
import java.util.Optional;

public interface Storage {
    public Employee addEmployee(Employee e);
    public Optional<Employee> getEmployee(int id);
    public List<Employee> getAllEmployees();
}
