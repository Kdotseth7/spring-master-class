package com.in28minutes.spring.basics.springin5steps.scope.xml;

public class XmlPersonDao {

    XmlJdbcConnection xmlJdbcConnection;

    public XmlJdbcConnection getXmlJdbcConnection() {
        return this.xmlJdbcConnection;
    }

    public void setXmlJdbcConnection(XmlJdbcConnection xmlJdbcConnection) {
        this.xmlJdbcConnection = xmlJdbcConnection;
    }

}