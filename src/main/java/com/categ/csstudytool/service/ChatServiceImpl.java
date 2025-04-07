package com.categ.csstudytool.service;

import com.categ.csstudytool.model.Chat;
import com.categ.csstudytool.repository.ChatRepository;
import org.springframework.stereotype.Service;

@Service
public class ChatServiceImpl implements ChatService {

    private ChatRepository chatRepository;

    @Override
    public Chat createChat(Chat chat) {
        return chatRepository.save(chat);
    }
}
