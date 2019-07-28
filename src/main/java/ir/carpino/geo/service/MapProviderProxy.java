package ir.carpino.geo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class MapProviderProxy {

    private final HashMap<String, MapProvider> registeredProvider;

    @Autowired
    public MapProviderProxy(List<MapProvider> mapProviders) {
        registeredProvider = new HashMap<>();

        mapProviders.forEach(mapProvider -> registeredProvider.put(mapProvider.providerName(), mapProvider));
    }
}
