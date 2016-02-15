package com.wangku.dpl.util;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class ReplicationDataSource extends AbstractRoutingDataSource{

	@Override
	protected Object determineCurrentLookupKey() {
		return ReplicationDataSourceHolder.getDataSource();
	}

}
