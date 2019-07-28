package ir.carpino.geo.service;

import org.springframework.stereotype.Service;

@Service
public class MapIrProvider implements MapProvider {

    @Override
    public String providerName() {
        return "MAP_IR";
    }
}
