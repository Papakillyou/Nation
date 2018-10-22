package com.mysql.basics;

import com.mysql.operation.DbcontextHolder;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DynamicDataSource  extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DbcontextHolder.getDbType();
    }
}
