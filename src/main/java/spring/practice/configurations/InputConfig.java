package spring.practice.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
public class InputConfig {
    public InputConfig() {}

    @Bean
    public Scanner getScanner() {
        return new Scanner(System.in);
    }
}
