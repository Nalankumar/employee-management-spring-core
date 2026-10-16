package spring.practice.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import spring.practice.entities.Employee;
import spring.practice.storage.Storage;

import java.io.IOException;
import java.util.List;

@Service
public class EmployeeService {
    private final Storage storage;
    private final NotificationService notificationService;
    private final InputService inputService;
    public EmployeeService(Storage storage, @Qualifier("console-notification") NotificationService notificationService, InputService inputService) {
        this.notificationService = notificationService;
        this.storage = storage;
        this.inputService = inputService;
    }

    public Employee getEmployee() {
        int id = inputService.getEmployeeId();
        return this.storage.getEmployee(id).orElseThrow();
    }

    public List<Employee> getEmployees() {
        return this.storage.getAllEmployees();
    }

    public Employee addEmployee() {
        Employee employee = inputService.getEmployee();
        Employee e = this.storage.addEmployee(employee);
        this.notificationService.send("employee added");
        return e;
    }
}
