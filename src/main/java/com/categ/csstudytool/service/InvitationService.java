package com.categ.csstudytool.service;

import com.categ.csstudytool.model.Invitation;
import jakarta.mail.MessagingException;

public interface InvitationService {

    public void sendInvitation(String email, Long projectId) throws MessagingException;

    public Invitation acceptInvitation(String token, Long userId) throws Exception;

    public String getTokenByEmail(String email);

    void deleteToken(String token);
}
