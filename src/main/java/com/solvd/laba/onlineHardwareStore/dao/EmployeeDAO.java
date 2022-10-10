package com.solvd.laba.onlineHardwareStore.dao;

import com.solvd.laba.onlineHardwareStore.dao.interfaces.IEmployeeDAO;
import com.solvd.laba.onlineHardwareStore.model.Employee;
import com.solvd.laba.onlineHardwareStore.util.OpenSession;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class EmployeeDAO implements IEmployeeDAO {
    private IEmployeeDAO entityDAO;
    private Class<IEmployeeDAO> DAOClass = IEmployeeDAO.class;

    @Override
    public List<Employee> getAllEmployees() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<Employee> entities = entityDAO.getAllEmployees();
        session.close();
        return entities;
    }

    @Override
    public void deleteEmployee(int id) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.deleteEmployee(id);
        session.commit();
        session.close();
    }

    @Override
    public void insertIntoEmployee(Employee employee) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.insertIntoEmployee(employee);
        session.commit();
        session.close();
    }

    @Override
    public void updateEmployee(Employee employee) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.updateEmployee(employee);
        session.commit();
        session.close();
    }
}
