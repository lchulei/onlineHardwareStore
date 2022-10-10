package com.solvd.laba.onlineHardwareStore.dao.interfaces;

import com.solvd.laba.onlineHardwareStore.model.Provider;

import java.sql.SQLException;
import java.util.List;

public interface IProviderDAO {

        List<Provider> getAllProviders();

        void deleteProvider(int id);

        void insertIntoProvider(Provider provider);

        void updateProvider(Provider provider);

        List<Provider> getAllProvidersJDBC() throws SQLException;

        void deleteProviderJDBC(int id);

        void insertIntoProviderJDBC(Provider provider);

        void updateProviderJDBC(Provider provider);
}
