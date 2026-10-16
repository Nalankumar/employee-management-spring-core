package spring.practice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.practice.configurations.AppConfig;
import spring.practice.services.EmployeeService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            EmployeeService employeeService = context.getBean(EmployeeService.class);
            Scanner scanner = context.getBean(Scanner.class);
            int choice;
            do {
                printConsoleMessage();
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        employeeService.addEmployee();
                        continue;
                    case 2:
                        System.out.println(employeeService.getEmployees());
                        continue;
                    case 3:
                        employeeService.getEmployee();
                        continue;
                    case 4:
                        System.out.println("Thank you for using this application!");
                        break;
                    default:
                        System.out.println("Invalid choice");
                        continue;
                }
            }
            while(choice != 4);
        }
    }

    private static void printConsoleMessage() {
        System.out.println("Please choose your choice:\n" +
                "1.Add employee\n" +
                "2.View All Employees\n" +
                "3.Get employee by ID\n" +
                "4.Exit\n");
    }
}