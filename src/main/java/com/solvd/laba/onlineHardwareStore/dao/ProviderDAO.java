package com.solvd.laba.onlineHardwareStore.dao;

import com.solvd.laba.onlineHardwareStore.connection.BasicConnectionPool;
import com.solvd.laba.onlineHardwareStore.dao.interfaces.IProviderDAO;
import com.solvd.laba.onlineHardwareStore.model.Provider;
import com.solvd.laba.onlineHardwareStore.util.OpenSession;
import org.apache.ibatis.session.SqlSession;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProviderDAO implements IProviderDAO {

    private IProviderDAO entityDAO;
    private Class<IProviderDAO> DAOClass = IProviderDAO.class;

    @Override
    public List<Provider> getAllProviders() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<Provider> entities = entityDAO.getAllProviders();
        session.close();
        return entities;
    }

    @Override
    public void deleteProvider(int id) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.deleteProvider(id);
        session.commit();
        session.close();
    }

    @Override
    public void insertIntoProvider(Provider provider) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.insertIntoProvider(provider);
        session.commit();
        session.close();
    }

    @Override
    public void updateProvider(Provider provider) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.updateProvider(provider);
        session.commit();
        session.close();
    }

    @Override
    public List<Provider> getAllProvidersJDBC() throws SQLException {
            BasicConnectionPool basicConnectionPool = BasicConnectionPool.create("jdbc:mysql://localhost/onlinehardwarestore", "root", "lm10112018");
            Connection connection = basicConnectionPool.getConnection();
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM provider";
            ResultSet resultSet = statement.executeQuery(sql);

            List<Provider> providerList = new ArrayList<>();

            while (resultSet.next()) {
                Provider provider = new Provider();
                provider.setId(resultSet.getInt("id"));
                provider.setCompanyName(resultSet.getString("companyName"));
                provider.setContractNumber(resultSet.getString("contractNumber"));
                providerList.add(provider);
            }

            resultSet.close();
            statement.close();
            connection.close();

            return providerList;
    }

    @Override
    public void deleteProviderJDBC(int id) {

    }

    @Override
    public void insertIntoProviderJDBC(Provider provider) {

    }

    @Override
    public void updateProviderJDBC(Provider provider) {

    }
}
