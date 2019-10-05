package hu.oe.hoe.adatok;

import java.util.ArrayList;
import java.util.List;

public class AssetRepository {
    public static final AssetRepository  instance = new AssetRepository();
    
    private List<Asset> assets = new ArrayList<>();

    public AssetRepository() {
        assets.add(new Asset("Kő", "nehéz"));
        assets.add(new Asset("Fa", "fa"));
    }

    public List<Asset> getAssets() {
        return assets;
}}
