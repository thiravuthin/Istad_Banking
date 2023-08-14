package com.istad.mbanking.utils;

import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor

public class MailUtil {

    private final JavaMailSender javaMailSender;
    public void sendMail(){
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper= new MimeMessageHelper(mimeMessage);

        // 1. Prepare template
        // 2. Prepare email information
        // 3. Send mail
        javaMailSender.send(mimeMessage);

    }
}
