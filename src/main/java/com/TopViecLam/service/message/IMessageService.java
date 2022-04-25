package com.TopViecLam.service.message;

import com.TopViecLam.model.Message;
import com.TopViecLam.service.IGeneralService;

public interface IMessageService extends IGeneralService<Message> {
    Iterable<Message> findAllBySenderId(Long id);
    Iterable<Message> findAllByReceiverId(Long id);
    Iterable<Message> findAllByUser(Long id);
    Iterable<Message> findAllBySenderAndReceiver(Long idSender, Long idReceiver);
}
