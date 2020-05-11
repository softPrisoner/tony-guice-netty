package com.rainbow.tony.guice.reader;

import com.google.inject.Inject;
import com.rainbow.tony.guice.base.Data;

import javax.sql.DataSource;

/**
 * DatabaseDataReader
 *
 * @author tony
 * @copyright rainbow
 * @description DatabaseDataReader
 * @date 2020-05-08
 */
public class DatabaseDataReader implements DataReader {

    /**
     * Connection Manager
     */
    private final ConnectionManager connectionManager;

    @Inject
    public DatabaseDataReader(
            ConnectionManager connectionManager) {
        this.connectionManager = connectionManager;
    }

    @Override
    public Data readData(DataSource dataSource) {
        // read data from the database
        return Data.of();
    }
}