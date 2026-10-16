package spring.practice.storage;

import org.springframework.stereotype.Repository;
import spring.practice.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class InMemorStorage implements Storage {
    private static List<Employee> employees;

    InMemorStorage() {
        employees = new ArrayList<>();
    }
    @Override
    public Employee addEmployee(Employee e) {
        employees.add(e);
        return e;
    }

    @Override
    public Optional<Employee> getEmployee(int id) {
        return employees.stream().filter(e -> e.getId() == id).findFirst();
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }
}
