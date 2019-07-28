package ir.carpino.geo.service;

public class GoogleProvider implements MapProvider {
    @Override
    public String providerName() {
        return "GOOGLE";
    }
}
