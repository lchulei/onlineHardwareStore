package com.solvd.laba.onlineHardwareStore.util.parsers.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.laba.onlineHardwareStore.model.Provider;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProviderJSON {
    private static final Logger LOGGER = Logger.getLogger(ProviderJSON.class);

    public static void marshal(Provider provider, String filePath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File(filePath), provider);
        } catch (IOException e) {
            LOGGER.error(e);
        }
    }

    public static void marshal(List<Provider> providers, String filePath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File(filePath), providers);
        } catch (IOException e) {
            LOGGER.error(e);
        }
    }

    public static Provider unmarshal(String filePath) {
        ObjectMapper mapper = new ObjectMapper();
        Provider currentProvider = null;
        try {
            currentProvider = mapper.readValue(new File(filePath), Provider.class);
        } catch (IOException e) {
            LOGGER.error(e);
        }
        return currentProvider;
    }

    public static List<Provider> unmarshalList(String filePath){
        ObjectMapper mapper = new ObjectMapper();
        List<Provider> listProviders = new ArrayList<>();
        try {
            listProviders = mapper.readValue(new File(filePath),
                    mapper.getTypeFactory().constructCollectionType(List.class, Provider.class));
        } catch (IOException e) {
            LOGGER.error(e);
        }
        return listProviders;
    }
}
