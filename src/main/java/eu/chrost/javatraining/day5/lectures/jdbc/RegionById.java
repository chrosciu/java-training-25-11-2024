package eu.chrost.javatraining.day5.lectures.jdbc;

import java.util.Optional;

public class RegionById {
    public static void main(String[] args) {
        RegionsDao regionsDao = new RegionsDao();
        Optional<Region> existingRegion = regionsDao.getRegionById(1);
        System.out.println(existingRegion);
        String regionName = existingRegion.map(Region::getRegionName).orElse("Non existing region");
        System.out.println(regionName);
        Optional<Region> nonExisitingRegion = regionsDao.getRegionById(5);
        System.out.println(nonExisitingRegion);
        regionName = nonExisitingRegion.map(Region::getRegionName).orElse("Non existing region");
        System.out.println(regionName);
    }
}
