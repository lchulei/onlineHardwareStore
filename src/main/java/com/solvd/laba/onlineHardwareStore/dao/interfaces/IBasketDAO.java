package com.solvd.laba.onlineHardwareStore.dao.interfaces;

import com.solvd.laba.onlineHardwareStore.model.Basket;

import java.util.List;

public interface IBasketDAO {

        List<Basket> getAllBaskets();

        void deleteBasket(int id);

        void insertIntoBasket(Basket basket);

        void updateBasket(Basket basket);
}
