package com.solvd.laba.onlineHardwareStore.dao.interfaces;

import com.solvd.laba.onlineHardwareStore.model.Position;

import java.util.List;

public interface IPositionDAO {
    List<Position> getAllPositions();

    void deletePosition(int id);

    void insertIntoPosition(Position position);

    void updatePosition(Position position);
}
