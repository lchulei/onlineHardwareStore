package com.solvd.laba.onlineHardwareStore;

import com.solvd.laba.onlineHardwareStore.connection.BasicConnectionPool;
import com.solvd.laba.onlineHardwareStore.dao.*;
import com.solvd.laba.onlineHardwareStore.model.*;
import com.solvd.laba.onlineHardwareStore.util.parsers.jaxb.ProviderXML;
import com.solvd.laba.onlineHardwareStore.util.parsers.json.ProviderJSON;
import org.apache.log4j.Logger;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Main {

    private static final org.apache.log4j.Logger LOGGER = Logger.getLogger(Main.class);

    public static <PurchaseHistoryMapperDAO, PurchaseHistoryMapper> void main(String args[]) {
//        ProviderDAO providerDAO = new ProviderDAO();
//        List<Provider> providerList = providerDAO.getAllProviders();
//        providerList.forEach(LOGGER::info);
//
//       LOGGER.info("");
//
//        Provider provider = new Provider();
//        provider.setId(55);
//        provider.setCompanyName("SDA");
//        provider.setContractNumber("55");
//
//        providerDAO.insertIntoProvider(provider);
//        providerList = providerDAO.getAllProviders();
//        providerList.forEach(LOGGER::info);
//
//        LOGGER.info("");
//
//        provider.setCompanyName("Lfd");
//            providerDAO.updateProvider(provider);
//            providerList = providerDAO.getAllProviders();
//            providerList.forEach(LOGGER::info);
//
//        LOGGER.info("");
//
//        providerDAO.deleteProvider(provider.getId());
//        providerList = providerDAO.getAllProviders();
//        providerList.forEach(LOGGER::info);

        //-------------------SQL------------------------

//        ClientDAO clientDAO = new ClientDAO();
//        List<Client> clientList = clientDAO.getAllClients();
//        clientList.forEach(LOGGER::info);
//
//        LOGGER.info("");
//
//        clientList = clientDAO.findClientByNumber("380956784319");
//        clientList.forEach(LOGGER::info);
//
//        LOGGER.info("");

        //------------------Check-------------------------

//        BasketHasEmployeeDAO basketHasEmployeeDAO = new BasketHasEmployeeDAO();
//        List<BasketHasEmployee> basketHasEmployeeList = basketHasEmployeeDAO.getAllBasketsHasEmployee();
//        basketHasEmployeeList.forEach(LOGGER::info);
//
//        EmployeeDAO employeeDAO = new EmployeeDAO();
//        List<Employee> employeeList = employeeDAO.getAllEmployees();
//        employeeList.forEach(LOGGER::info);

        //---------------------JSON----------------------

//        ProviderDAO providerDAO = new ProviderDAO();
//        List<Provider> providerList = providerDAO.getAllProviders();
//        providerList.forEach(LOGGER::info);
//        ProviderJSON.marshal(providerList, "./src/main/resources/json/provider.json");
//
//        LOGGER.info("");
//
//        List<Provider> providerList1 = ProviderJSON.unmarshalList("./src/main/resources/json/provider.json");
//        providerList1.forEach(LOGGER::info);

        //---------------------JAXB-----------------------

//        ProviderDAO providerDAO = new ProviderDAO();
//        List<Provider> providerList = providerDAO.getAllProviders();
//        try {
//            ProviderXML.marshalList(providerList,"./src/main/resources/jaxb/provider.xml");
//        } catch (IOException | JAXBException e) {
//            throw new RuntimeException(e);
//        }
//
//        try {
//            List<Provider> providerList1 = ProviderXML.unmarshalList("./src/main/resources/jaxb/provider.xml");
//            for (Provider provider : providerList1) {
//                LOGGER.info(provider.toString());
//            }
//        } catch (IOException | JAXBException e) {
//            throw new RuntimeException(e);
//        }

        //---------------------JDBC-----------------------

//        try {
//            BasicConnectionPool basicConnectionPool = BasicConnectionPool.create("jdbc:mysql://localhost/onlinehardwarestore", "root", "lm10112018");
//            Connection connection = basicConnectionPool.getConnection();
//            Statement statement = connection.createStatement();
//            String sql = "SELECT * FROM provider";
//            ResultSet resultSet = statement.executeQuery(sql);
//
//            while (resultSet.next()) {
//                LOGGER.info(resultSet.getInt("id") + "  " + resultSet.getString("companyName"));
//            }
//
//            resultSet.close();
//            statement.close();
//            connection.close();
//        } catch (SQLException e) {
//            LOGGER.error(e.getMessage());
//        }

        Provider provider = new Provider(10, "adsa", "12");

        ProviderDAO providerDAO = new ProviderDAO();
        try {
            providerDAO.getAllProvidersJDBC().forEach(LOGGER::info);
            LOGGER.info("");

            providerDAO.insertIntoProviderJDBC(provider);
            providerDAO.getAllProvidersJDBC().forEach(LOGGER::info);
            LOGGER.info("");

            provider.setCompanyName("kilka");
            providerDAO.updateProviderJDBC(provider);
            providerDAO.getAllProvidersJDBC().forEach(LOGGER::info);
            LOGGER.info("");

            providerDAO.deleteProviderJDBC(10);
            providerDAO.getAllProvidersJDBC().forEach(LOGGER::info);
            LOGGER.info("");

            providerDAO.findProviderByCompanyName("Asus").forEach(LOGGER::info);
        } catch (SQLException e) {
            LOGGER.error(e.getMessage());
        }

    }
}
