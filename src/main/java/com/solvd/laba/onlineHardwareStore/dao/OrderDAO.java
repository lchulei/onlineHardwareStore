package com.solvd.laba.onlineHardwareStore.dao;

import com.solvd.laba.onlineHardwareStore.dao.interfaces.IOrderDAO;
import com.solvd.laba.onlineHardwareStore.model.Order;
import com.solvd.laba.onlineHardwareStore.util.OpenSession;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class OrderDAO implements IOrderDAO {
    private IOrderDAO entityDAO;
    private Class<IOrderDAO> DAOClass = IOrderDAO.class;

    @Override
    public List<Order> getAllOrders() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<Order> entities = entityDAO.getAllOrders();
        session.close();
        return entities;
    }

    @Override
    public void deleteOrder(int id) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.deleteOrder(id);
        session.commit();
        session.close();
    }

    @Override
    public void insertIntoOrder(Order order) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.insertIntoOrder(order);
        session.commit();
        session.close();
    }

    @Override
    public void updateOrder(Order order) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.updateOrder(order);
        session.commit();
        session.close();
    }
}
