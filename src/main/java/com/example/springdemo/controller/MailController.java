package com.example.springdemo.controller;

import com.example.springdemo.mail.MailSender;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MailController {


    private final MailSender mailSender;

    public MailController(@Qualifier("smtp")MailSender mailSender) {
        this.mailSender = mailSender;
    }
    @RequestMapping ("/mail")
    @ResponseBody
    public String mail() {
        mailSender.sendMail("test@example.com", "Test mail", "This is a test mail");
        return "This Mail has been sent using " + mailSender.getClass().getSimpleName();
    }
}
