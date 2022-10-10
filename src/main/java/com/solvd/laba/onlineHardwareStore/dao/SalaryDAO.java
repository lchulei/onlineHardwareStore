package com.solvd.laba.onlineHardwareStore.dao;

import com.solvd.laba.onlineHardwareStore.dao.interfaces.ISalaryDAO;
import com.solvd.laba.onlineHardwareStore.model.Salary;
import com.solvd.laba.onlineHardwareStore.util.OpenSession;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class SalaryDAO implements ISalaryDAO {
    private ISalaryDAO entityDAO;
    private Class<ISalaryDAO> DAOClass = ISalaryDAO.class;

    @Override
    public List<Salary> getAllSalary() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<Salary> entities = entityDAO.getAllSalary();
        session.close();
        return entities;
    }

    @Override
    public void deleteSalary(int id) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.deleteSalary(id);
        session.commit();
        session.close();
    }

    @Override
    public void insertIntoSalary(Salary salary) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.insertIntoSalary(salary);
        session.commit();
        session.close();
    }

    @Override
    public void updateSalary(Salary salary) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.updateSalary(salary);
        session.commit();
        session.close();
    }
}
