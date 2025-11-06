package com.example.Employees.service;

import com.example.Employees.model.EmployeesModel;
import com.example.Employees.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DbLogic {

    @Autowired
    private EmployeesRepository employeesRepository;

    public List<EmployeesModel> getAll() {
        return employeesRepository.findAll();
    }

    public EmployeesModel getOne(Long id){
        return employeesRepository.findById(id).get();
    }

    public Optional<EmployeesModel> getByName(String name){
        return employeesRepository.findByName(name);
    }

    public EmployeesModel addEmployee(EmployeesModel employeesModel){
        return employeesRepository.save(employeesModel);
    }

    public String deletedEmployee(Long id){
        if(employeesRepository.existsById(id)){
            employeesRepository.deleteById(id);
            return "Employee at id = " + id + " deleted successfully";

        }else{
            return "Employee at this id " + id + " not found";
        }


    }
}
