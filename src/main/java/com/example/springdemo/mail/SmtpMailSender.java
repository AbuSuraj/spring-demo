package com.example.springdemo.mail;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("smtp")
public class SmtpMailSender implements MailSender{
    private static Log log = LogFactory.getLog(MockMailSender.class);

    @Override
    public void sendMail(String to, String subject, String body) {
        log.info("SMTP is sending mail");
        log.info("SMTP Sending mail to " + to + " with subject " + subject + " and body " + body);
    }
}
