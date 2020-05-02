package com.mylabs.xmlspringcore.example2;

public class XMlDAOImpl {

    private XMlJdbcConnection xmlJdbcConnection;

    public void setXmlJdbcConnection(XMlJdbcConnection xmlJdbcConnection) {
        this.xmlJdbcConnection = xmlJdbcConnection;
    }

    public XMlDAOImpl(XMlJdbcConnection xmlJdbcConnection){
        this.xmlJdbcConnection = xmlJdbcConnection;
        System.out.println("constructor injection XMLDAO created.");
    }

    public XMlDAOImpl(){
        System.out.println("XMLDAO created.");
    }
}
