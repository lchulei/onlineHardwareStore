package com.solvd.laba.onlineHardwareStore.util.parsers.jaxb;

import com.solvd.laba.onlineHardwareStore.model.Provider;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "list-provider")
public class ProviderHolder {
    private List<Provider> provider = new ArrayList<Provider>();

    public ProviderHolder() {
    }

    public ProviderHolder(List<Provider> provider) {
        this.provider = provider;
    }

    public List<Provider> getProvider() {
        return provider;
    }

    @XmlElement(name = "provider", type = Provider.class)
    public void setProvider(List<Provider> provider) {
        this.provider = provider;
    }
}
