package org.ahmtkutlu.patterns.abstractfactory;

public class OracleConnection implements Connection {

    private String host;
    private String port;
    private String user;
    private String password;

    public OracleConnection(String host, String port, String user, String password) {
        this.host = host;
        this.port = port;
        this.user = user;
        this.password = password;
    }

    @Override
    public void connect() {
        System.out.println("Oracle DB connection is OK!");
    }

    @Override
    public String toString() {
        return "OracleConnection{" +
                "host='" + host + '\'' +
                ", port='" + port + '\'' +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}