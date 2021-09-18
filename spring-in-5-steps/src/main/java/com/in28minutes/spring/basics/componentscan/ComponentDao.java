package com.in28minutes.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDao {

    @Autowired
    ComponentJdbcConnection jdbcConnection;

    public ComponentJdbcConnection getJdbcConnection() {
        return this.jdbcConnection;
    }

    public void setJdbcConnection(ComponentJdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }

}