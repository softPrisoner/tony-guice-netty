package com.rainbow.tony.guice.reader;

import com.rainbow.tony.guice.base.Data;

import javax.sql.DataSource;

/**
 * DataReader
 *
 * @author tony
 * @copyright rainbow
 * @description DataReader
 * @date 2020-05-08
 */
public interface DataReader {

    /**
     * 读取数据
     *
     * @param dataSource DataSource
     * @return Data
     */
    Data readData(DataSource dataSource);
}