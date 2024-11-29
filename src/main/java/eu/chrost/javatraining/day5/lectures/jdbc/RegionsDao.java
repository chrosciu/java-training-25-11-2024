package eu.chrost.javatraining.day5.lectures.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RegionsDao {
    public List<Region> getAllRegions() {
        List<Region> regions = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DatabaseConnector.getConnection();
            statement = connection.createStatement();
            String query = "select * from regions";
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Long regionId = resultSet.getLong("region_id");
                String regionName = resultSet.getString("region_name");
                Region region = new Region(regionId, regionName);
                regions.add(region);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return regions;
    }

    public Optional<Region> getRegionById(long id) {
        Region region = null;
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DatabaseConnector.getConnection();
            statement = connection.prepareStatement("select * from regions where region_id = ?");
            statement.setLong(1, id);
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                Long regionId = resultSet.getLong("region_id");
                String regionName = resultSet.getString("region_name");
                region = new Region(regionId, regionName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return Optional.ofNullable(region);

    }
}
