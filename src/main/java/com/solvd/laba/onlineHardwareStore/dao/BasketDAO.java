package com.solvd.laba.onlineHardwareStore.dao;

import com.solvd.laba.onlineHardwareStore.dao.interfaces.IBasketDAO;
import com.solvd.laba.onlineHardwareStore.model.Basket;
import com.solvd.laba.onlineHardwareStore.util.OpenSession;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class BasketDAO implements IBasketDAO {

    private IBasketDAO entityDAO;
    private Class<IBasketDAO> DAOClass = IBasketDAO.class;

    @Override
    public List<Basket> getAllBaskets() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<Basket> entities = entityDAO.getAllBaskets();
        session.close();
        return entities;
    }

    @Override
    public void deleteBasket(int id) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.deleteBasket(id);
        session.commit();
        session.close();
    }

    @Override
    public void insertIntoBasket(Basket basket) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.insertIntoBasket(basket);
        session.commit();
        session.close();
    }

    @Override
    public void updateBasket(Basket basket) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.updateBasket(basket);
        session.commit();
        session.close();
    }
}
