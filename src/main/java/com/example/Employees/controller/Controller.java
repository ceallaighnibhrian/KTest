package com.example.Employees.controller;

import com.example.Employees.model.EmployeesModel;
import com.example.Employees.service.DbLogic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
public class Controller {


    private final DbLogic dbLogic;
    @Autowired
    public Controller(DbLogic dbLogic) {
        this.dbLogic = dbLogic;
    }

    @GetMapping("/show")
    public List<EmployeesModel> show(){
        return dbLogic.getAll();
    }

    @GetMapping("/show/{id}")
    public EmployeesModel show(@PathVariable Long id){
        return dbLogic.getOne(id);
    }

    @GetMapping("/showName/{name}")
    public Optional<EmployeesModel> show(@PathVariable String name){
        return dbLogic.getByName(name);
    }

    @PostMapping("/add")
    public EmployeesModel add(@RequestBody EmployeesModel eM){
        return dbLogic.addEmployee(eM);
    }

    @DeleteMapping("/del/{id}")
    public String delete(@PathVariable Long id){
        return dbLogic.deletedEmployee(id);
    }
}
