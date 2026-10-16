package spring.practice.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
@Qualifier("console-notification")
public class ConsoleNotificationService implements NotificationService {
    public void send(String message) {
        System.out.println("from console: " + message);
    }
}
