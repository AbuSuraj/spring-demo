package com.example.springdemo.mail;

public interface MailSender {
    void sendMail(String to, String subject, String body);
}
