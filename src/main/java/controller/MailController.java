package controller;

import mail.MailSender;
import mail.MockMailSender;
import mail.SmtpMailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MailController {

    @Autowired
    private MailSender mailSender;

    @GetMapping("/mail")
    @ResponseBody
    public String mail() {
        mailSender.sendMail("test@example.com", "Test mail", "This is a test mail");
        return "Mail sent using " + mailSender.getClass().getSimpleName();
    }
}
