package com.tw.apistackbase.Controller;

import com.tw.apistackbase.dao.CompanyRepository;
import com.tw.apistackbase.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompanyController {
    @Autowired
    CompanyRepository companyRepository;

    @GetMapping("/companies")
    public List<Company> findAll(){
        return companyRepository.findAll();
    }

    @PostMapping("/companies")
    public void addCompany(@RequestBody Company company){
        companyRepository.save(company);
    }

    @PutMapping("/companies")
    public void updateCompany(@RequestBody Company company){
        companyRepository.save(company);
    }

    @DeleteMapping("/companies")
    public void deleteCompany(@RequestBody Company company){
        companyRepository.delete(company);
    }
}
