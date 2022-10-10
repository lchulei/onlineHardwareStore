package com.solvd.laba.onlineHardwareStore.dao;

import com.solvd.laba.onlineHardwareStore.dao.interfaces.ICharacteristicsDAO;
import com.solvd.laba.onlineHardwareStore.model.Characteristics;
import com.solvd.laba.onlineHardwareStore.util.OpenSession;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class CharacteristicsDAO implements ICharacteristicsDAO {
    private ICharacteristicsDAO entityDAO;
    private Class<ICharacteristicsDAO> DAOClass = ICharacteristicsDAO.class;

    @Override
    public List<Characteristics> getAllCharacteristics() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<Characteristics> entities = entityDAO.getAllCharacteristics();
        session.close();
        return entities;
    }

    @Override
    public void deleteCharacteristics(int id) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.deleteCharacteristics(id);
        session.commit();
        session.close();
    }

    @Override
    public void insertIntoCharacteristics(Characteristics characteristics) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.insertIntoCharacteristics(characteristics);
        session.commit();
        session.close();
    }

    @Override
    public void updateCharacteristics(Characteristics characteristics) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.updateCharacteristics(characteristics);
        session.commit();
        session.close();
    }
}
