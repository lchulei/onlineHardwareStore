package com.solvd.laba.onlineHardwareStore.dao.interfaces;

import com.solvd.laba.onlineHardwareStore.model.Employee;

import java.util.List;

public interface IEmployeeDAO {

    List<Employee> getAllEmployees();

    void deleteEmployee(int id);

    void insertIntoEmployee(Employee employee);

    void updateEmployee(Employee employee);
}
