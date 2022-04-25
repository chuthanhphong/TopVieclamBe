package com.TopViecLam.service.danhSachCv;

import com.TopViecLam.model.DanhSachCv;
import com.TopViecLam.repository.IDanhSachCvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DanhSachCvService implements IDanhSachCvService {
    @Autowired
    private IDanhSachCvRepository danhSachCvRepository;
    @Override
    public Iterable<DanhSachCv> findAll() {
        return danhSachCvRepository.findAll();
    }

    @Override
    public Optional<DanhSachCv> findById(Long id) {
        return danhSachCvRepository.findById(id);
    }

    @Override
    public DanhSachCv save(DanhSachCv danhSachCv) {
        return danhSachCvRepository.save(danhSachCv);
    }

    @Override
    public void remove(Long id) {
            danhSachCvRepository.deleteById(id);
    }
}
