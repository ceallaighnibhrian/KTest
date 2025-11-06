package com.example.Employees.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employees")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeesModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
@Column(name = "name")
    private  String name;
@Column(name = "department")
    private  String department;
@Column(name = "salary")
    private int salary;

}
