package com.solvd.laba.onlineHardwareStore.dao.interfaces;

import com.solvd.laba.onlineHardwareStore.model.Client;

import java.util.List;

public interface IClientDAO {
    List<Client> getAllClients();

    void deleteClient(int id);

    void insertIntoClient(Client client);

    void updateClient(Client client);

    List<Client> findClientByNumber(String number);
}
