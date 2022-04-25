package com.TopViecLam.service.message;

import com.TopViecLam.model.Message;
import com.TopViecLam.repository.IMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class MessageService implements IMessageService{

    @Autowired
    private IMessageRepository messageRepository;

    @Override
    public Iterable<Message> findAll() {
        return messageRepository.findAll();
    }

    @Override
    public Optional<Message> findById(Long id) {
        return messageRepository.findById(id);
    }

    @Override
    public Message save(Message message) {
        return messageRepository.save(message);
    }

    @Override
    public void remove(Long id) {
            messageRepository.deleteById(id);
    }

    @Override
    public Iterable<Message> findAllBySenderId(Long id) {
        return messageRepository.findAllBySenderId(id);
    }

    @Override
    public Iterable<Message> findAllByReceiverId(Long id) {
        return messageRepository.findAllByReceiverId(id);
    }

    @Override
    public Iterable<Message> findAllByUser(Long id) {
        return messageRepository.findAllByUser(id);
    }

    @Override
    public Iterable<Message> findAllBySenderAndReceiver(Long idSender, Long idReceiver) {
        return messageRepository.findAllBySenderAndReceiver(idSender, idReceiver);
    }
}
