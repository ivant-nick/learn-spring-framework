package com.spring.core.my.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

// Step 1: Define DataSource interface
interface DataSource {
    String[] getEmails();
}

// Step 2: Implement DataSource for MySQL
@Component
class SQLDataSource implements DataSource {
    @Override
    public String[] getEmails() {
        return new String[]{"mysql1@example.com", "mysql2@example.com"};
    }
}

// Step 3: Implement DataSource for PostgreSQL
@Component
@Primary
class PostgreSQLDataSource implements DataSource {
    @Override
    public String[] getEmails() {
        return new String[]{"pgsql1@example.com", "pgsql2@example.com"};
    }
}

// Step 4: Create EmailService
@Component
class EmailService {
    private final DataSource dataSource;

    @Autowired
    public EmailService(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void sendEmail() {
        System.out.println("Sending emails to: " + Arrays.toString(dataSource.getEmails()));
    }
}

// Step 5: Configuration and Main Class
@Configuration
@ComponentScan(basePackages = "com.spring.core.my.assignment")
class AppConfig {

}


public class Client {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EmailService emailService = context.getBean(EmailService.class);
        emailService.sendEmail();
        context.close();
    }
}
