package com.solvd.laba.onlineHardwareStore.dao;

import com.solvd.laba.onlineHardwareStore.dao.interfaces.IPurchaseHistoryDAO;
import com.solvd.laba.onlineHardwareStore.model.PurchaseHistory;
import com.solvd.laba.onlineHardwareStore.util.OpenSession;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class PurchaseHistoryDAO implements IPurchaseHistoryDAO{
    private IPurchaseHistoryDAO entityDAO;
    private Class<IPurchaseHistoryDAO> DAOClass = IPurchaseHistoryDAO.class;

    @Override
    public List<PurchaseHistory> getAllPurchaseHistorys() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<PurchaseHistory> entities = entityDAO.getAllPurchaseHistorys();
        session.close();
        return entities;
    }

    @Override
    public void deletePurchaseHistory(int id) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.deletePurchaseHistory(id);
        session.commit();
        session.close();
    }

    @Override
    public void insertIntoPurchaseHistory(PurchaseHistory purchaseHistory) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.insertIntoPurchaseHistory(purchaseHistory);
        session.commit();
        session.close();
    }

    @Override
    public void updatePurchaseHistory(PurchaseHistory purchaseHistory) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.updatePurchaseHistory(purchaseHistory);
        session.commit();
        session.close();
    }
}
