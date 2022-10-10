package com.solvd.laba.onlineHardwareStore.dao;

import com.solvd.laba.onlineHardwareStore.dao.interfaces.IBasketHasProductDAO;
import com.solvd.laba.onlineHardwareStore.model.BasketHasProduct;
import com.solvd.laba.onlineHardwareStore.util.OpenSession;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class BasketHasProductDAO implements IBasketHasProductDAO {
    private IBasketHasProductDAO entityDAO;
    private Class<IBasketHasProductDAO> DAOClass = IBasketHasProductDAO.class;

    @Override
    public List<BasketHasProduct> getAllBasketsHasProduct() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<BasketHasProduct> entities = entityDAO.getAllBasketsHasProduct();
        session.close();
        return entities;
    }

    @Override
    public void deleteBasketHasProduct(int id) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.deleteBasketHasProduct(id);
        session.commit();
        session.close();
    }

    @Override
    public void insertIntoBasketHasProduct(BasketHasProduct basketHasProduct) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.insertIntoBasketHasProduct(basketHasProduct);
        session.commit();
        session.close();
    }

    @Override
    public void updateBasketHasProduct(BasketHasProduct basketHasProduct) {
            SqlSession session = OpenSession.getOpenSession().openSession();
            entityDAO = session.getMapper(DAOClass);
            entityDAO.updateBasketHasProduct(basketHasProduct);
            session.commit();
            session.close();
    }
}
