package com.solvd.laba.onlineHardwareStore.dao.interfaces;

import com.solvd.laba.onlineHardwareStore.model.Salary;

import java.util.List;

public interface ISalaryDAO {
    List<Salary> getAllSalary();

    void deleteSalary(int id);

    void insertIntoSalary(Salary salary);

    void updateSalary(Salary salary);
}
