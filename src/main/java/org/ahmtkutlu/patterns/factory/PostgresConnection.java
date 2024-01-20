package org.ahmtkutlu.patterns.factory;

public class PostgresConnection implements Connection{

    private String host;
    private String port;
    private String user;
    private String password;

    public PostgresConnection(String host, String port, String user, String password) {
        this.host = host;
        this.port = port;
        this.user = user;
        this.password = password;
    }

    @Override
    public void connect() {
        System.out.println("Postgres DB connection is OK!");
    }

    @Override
    public String toString() {
        return "PostgresConnection{" +
                "host='" + host + '\'' +
                ", port='" + port + '\'' +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}