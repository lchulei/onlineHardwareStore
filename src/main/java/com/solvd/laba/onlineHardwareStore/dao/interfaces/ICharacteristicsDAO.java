package com.solvd.laba.onlineHardwareStore.dao.interfaces;

import com.solvd.laba.onlineHardwareStore.model.Characteristics;

import java.util.List;

public interface ICharacteristicsDAO {
    List<Characteristics> getAllCharacteristics();

    void deleteCharacteristics(int id);

    void insertIntoCharacteristics(Characteristics characteristics);

    void updateCharacteristics(Characteristics characteristics);
}
