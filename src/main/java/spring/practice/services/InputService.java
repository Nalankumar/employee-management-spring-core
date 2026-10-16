package spring.practice.services;

import org.springframework.stereotype.Component;
import spring.practice.entities.Employee;
import java.util.Scanner;

@Component
public class InputService {
    private final Scanner scanner;
    public InputService(Scanner scanner) {
        this.scanner = scanner;
    }

    public Employee getEmployee() {
        Employee employee = null;
        try{
            System.out.println("Enter name: ");
            String name = scanner.nextLine();
            System.out.println("Enter position: ");
            String position = scanner.nextLine();
            System.out.println("Enter department: ");
            String department = scanner.nextLine();
            System.out.println("Enter salary: ");
            double salary = scanner.nextDouble();
            employee = new Employee((name + position).hashCode(), name, salary, department, position);
        } catch (Exception e){
            System.out.println("Invalid input");
        }
        return employee;
    }

    public int getEmployeeId() {
        System.out.println("Enter employee id: ");
        return scanner.nextInt();
    }

}

