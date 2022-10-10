package com.solvd.laba.onlineHardwareStore.util.parsers.jaxb;

import com.solvd.laba.onlineHardwareStore.model.Provider;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ProviderXML {

    public static void marshal(Provider provider, String filePath) throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(Provider.class);
        Marshaller mar= context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(provider, new FileWriter(filePath));
    }

    public static void marshalList(List<Provider> provider, String filePath) throws IOException, JAXBException {
        JAXBContext context = JAXBContext.newInstance(ProviderHolder.class);
        Marshaller mar = context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        ProviderHolder providerHolder = new ProviderHolder(provider);
        mar.marshal(providerHolder, new File(filePath));
    }

    public static Provider unmarshal(String filePath) throws IOException, JAXBException {
        Provider provider;
        JAXBContext context = JAXBContext.newInstance(Provider.class);
        Unmarshaller um = context.createUnmarshaller();
        provider = (Provider) um.unmarshal(new File(filePath));
        return provider;
    }

    public static List<Provider> unmarshalList(String filePath) throws IOException, JAXBException {
        ProviderHolder providerHolder;
        JAXBContext context = JAXBContext.newInstance(ProviderHolder.class);
        Unmarshaller um = context.createUnmarshaller();
        providerHolder =(ProviderHolder) um.unmarshal(new File(filePath));
        return providerHolder.getProvider();
    }
}
