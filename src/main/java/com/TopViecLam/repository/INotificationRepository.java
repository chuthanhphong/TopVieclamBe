package com.TopViecLam.repository;

import com.TopViecLam.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface INotificationRepository extends JpaRepository<Notification, Long> {
    // Tìm thông báo theo id user
    @Query("select noti from Notification noti where noti.user.id = :id")
    Iterable<Notification> findAllByUserId(Long id);

    // Tìm những thông báo chưa được đọc
    @Query("select noti from Notification noti where noti.status =0 and noti.user.id =:id")
    Iterable<Notification> findAllByStatus0(Long id);
}
