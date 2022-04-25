package com.TopViecLam.service.notification;

import com.TopViecLam.model.Notification;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NotificationService implements INotificationService {
    @Override
    public Iterable<Notification> findAll() {
        return null;
    }

    @Override
    public Optional<Notification> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Notification save(Notification notification) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public Iterable<Notification> findAllByUserId(Long id) {
        return null;
    }

    @Override
    public Iterable<Notification> findAllByStatus0(Long id) {
        return null;
    }
}
