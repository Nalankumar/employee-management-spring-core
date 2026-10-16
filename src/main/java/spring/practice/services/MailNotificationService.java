package spring.practice.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("mail-notification")
public class MailNotificationService implements NotificationService {
    public void send(String message) {
        System.out.println("from mail: " + message);
    }
}
