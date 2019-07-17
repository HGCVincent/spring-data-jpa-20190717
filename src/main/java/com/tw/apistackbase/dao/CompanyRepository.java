package com.tw.apistackbase.dao;

import com.tw.apistackbase.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Integer> {
}
