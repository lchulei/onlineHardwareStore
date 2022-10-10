package com.solvd.laba.onlineHardwareStore.dao;

import com.solvd.laba.onlineHardwareStore.dao.interfaces.IPositionDAO;
import com.solvd.laba.onlineHardwareStore.dao.interfaces.IProviderDAO;
import com.solvd.laba.onlineHardwareStore.model.Position;
import com.solvd.laba.onlineHardwareStore.util.OpenSession;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class PositionDAO implements IPositionDAO {
    private IPositionDAO entityDAO;
    private Class<IPositionDAO> DAOClass = IPositionDAO.class;

    @Override
    public List<Position> getAllPositions() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<Position> entities = entityDAO.getAllPositions();
        session.close();
        return entities;
    }

    @Override
    public void deletePosition(int id) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.deletePosition(id);
        session.commit();
        session.close();
    }

    @Override
    public void insertIntoPosition(Position position) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.insertIntoPosition(position);
        session.commit();
        session.close();
    }

    @Override
    public void updatePosition(Position position) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.updatePosition(position);
        session.commit();
        session.close();
    }
}
