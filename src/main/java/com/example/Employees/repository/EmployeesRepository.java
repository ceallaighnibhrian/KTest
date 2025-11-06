package com.example.Employees.repository;

import com.example.Employees.model.EmployeesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface EmployeesRepository extends JpaRepository<EmployeesModel,Long> {
    Optional<EmployeesModel> findByName(String name);

}
