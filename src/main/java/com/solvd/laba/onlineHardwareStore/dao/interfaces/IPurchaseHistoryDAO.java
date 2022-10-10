package com.solvd.laba.onlineHardwareStore.dao.interfaces;

import com.solvd.laba.onlineHardwareStore.model.PurchaseHistory;

import java.util.List;

public interface IPurchaseHistoryDAO {
    List<PurchaseHistory> getAllPurchaseHistorys();

    void deletePurchaseHistory(int id);

    void insertIntoPurchaseHistory(PurchaseHistory purchaseHistory);

    void updatePurchaseHistory(PurchaseHistory purchaseHistory);
}
