package com.categ.csstudytool.service;

import jakarta.mail.MessagingException;
import org.springframework.stereotype.Service;

public interface EmailService {
    void sendEmailWithToken(String userEmail, String Link) throws MessagingException;

}
