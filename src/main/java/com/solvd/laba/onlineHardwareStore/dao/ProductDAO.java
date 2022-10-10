package com.solvd.laba.onlineHardwareStore.dao;

import com.solvd.laba.onlineHardwareStore.dao.interfaces.IProductDAO;
import com.solvd.laba.onlineHardwareStore.model.Product;
import com.solvd.laba.onlineHardwareStore.util.OpenSession;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ProductDAO implements IProductDAO {
    private IProductDAO entityDAO;
    private Class<IProductDAO> DAOClass = IProductDAO.class;

    @Override
    public List<Product> getAllProducts() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<Product> entities = entityDAO.getAllProducts();
        session.close();
        return entities;
    }

    @Override
    public void deleteProduct(int id) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.deleteProduct(id);
        session.commit();
        session.close();
    }

    @Override
    public void insertIntoProduct(Product product) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.insertIntoProduct(product);
        session.commit();
        session.close();
    }

    @Override
    public void updateProduct(Product product) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.updateProduct(product);
        session.commit();
        session.close();
    }
}
