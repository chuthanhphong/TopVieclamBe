package com.TopViecLam.service.notification;

import com.TopViecLam.model.Notification;
import com.TopViecLam.service.IGeneralService;

public interface INotificationService extends IGeneralService<Notification> {
    Iterable<Notification> findAllByUserId(Long id);

    Iterable<Notification> findAllByStatus0(Long id);
}
