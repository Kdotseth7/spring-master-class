package com.in28minutes.spring.basics.springin5steps.scope;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class JdbcConnection {

    public JdbcConnection() {
        System.out.println("Jdbc Connection");
    }
}