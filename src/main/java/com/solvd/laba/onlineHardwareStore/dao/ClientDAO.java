package com.solvd.laba.onlineHardwareStore.dao;

import com.solvd.laba.onlineHardwareStore.dao.interfaces.IClientDAO;
import com.solvd.laba.onlineHardwareStore.model.Client;
import com.solvd.laba.onlineHardwareStore.util.OpenSession;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ClientDAO implements IClientDAO {
    private IClientDAO entityDAO;
    private Class<IClientDAO> DAOClass = IClientDAO.class;

    @Override
    public List<Client> getAllClients() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<Client> entities = entityDAO.getAllClients();
        session.close();
        return entities;
    }

    @Override
    public void deleteClient(int id) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.deleteClient(id);
        session.commit();
        session.close();
    }

    @Override
    public void insertIntoClient(Client client) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.insertIntoClient(client);
        session.commit();
        session.close();
    }

    @Override
    public void updateClient(Client client) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.updateClient(client);
        session.commit();
        session.close();
    }

    @Override
    public List<Client> findClientByNumber(String number) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<Client> entities = entityDAO.findClientByNumber(number);
        session.close();
        return entities;
    }
}
