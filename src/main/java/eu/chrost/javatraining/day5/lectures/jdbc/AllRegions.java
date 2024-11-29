package eu.chrost.javatraining.day5.lectures.jdbc;

import java.util.List;

public class AllRegions {
    public static void main(String[] args) {
        RegionsDao regionsDao = new RegionsDao();
        List<Region> regions = regionsDao.getAllRegions();
        System.out.println(regions);
    }
}
