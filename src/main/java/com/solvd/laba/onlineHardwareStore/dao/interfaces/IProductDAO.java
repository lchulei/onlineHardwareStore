package com.solvd.laba.onlineHardwareStore.dao.interfaces;

import com.solvd.laba.onlineHardwareStore.model.Product;

import java.util.List;

public interface IProductDAO {

    List<Product> getAllProducts();

    void deleteProduct(int id);

    void insertIntoProduct(Product product);

    void updateProduct(Product product);
}
