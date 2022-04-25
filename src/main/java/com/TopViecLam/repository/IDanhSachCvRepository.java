package com.TopViecLam.repository;

import com.TopViecLam.model.DanhSachCv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDanhSachCvRepository  extends JpaRepository<DanhSachCv, Long> {
}
