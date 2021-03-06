package com.TopViecLam.service.company;


import com.TopViecLam.model.Company;
import com.TopViecLam.repository.ICompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyService implements ICompanyService {
    @Autowired
    private ICompanyRepository companyRepository;
    @Override
    public Iterable<Company> findAll() {
        return companyRepository.findAll();
    }

    @Override
    public Optional<Company> findById(Long id) {
        return companyRepository.findById(id);
    }

    @Override
    public Company save(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public void remove(Long id) {
            companyRepository.deleteById(id);
    }
}
