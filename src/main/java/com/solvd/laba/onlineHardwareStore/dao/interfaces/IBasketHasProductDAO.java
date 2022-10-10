package com.solvd.laba.onlineHardwareStore.dao.interfaces;

import com.solvd.laba.onlineHardwareStore.model.BasketHasProduct;

import java.util.List;

public interface IBasketHasProductDAO {
    List<BasketHasProduct> getAllBasketsHasProduct();

    void deleteBasketHasProduct(int id);

    void insertIntoBasketHasProduct(BasketHasProduct basketHasProduct);

    void updateBasketHasProduct(BasketHasProduct basketHasProduct);
}
