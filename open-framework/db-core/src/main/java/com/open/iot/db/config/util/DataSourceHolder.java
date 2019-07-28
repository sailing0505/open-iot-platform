package com.open.iot.db.config.util;

/**
 * 
* @ClassName: DataSourceHolder 
* @Description: 用于数据源切换
* @author huy
* @date 2019年7月28日 下午12:25:34 
*
 */
public class DataSourceHolder {

    private static final ThreadLocal<DataSourceKey> dataSourceKey = new ThreadLocal<>();

    public static DataSourceKey getDataSourceKey() {
        return dataSourceKey.get();
    }

    public static void setDataSourceKey(DataSourceKey type) {
        dataSourceKey.set(type);
    }

    public static void clearDataSourceKey() {
        dataSourceKey.remove();
    }


}