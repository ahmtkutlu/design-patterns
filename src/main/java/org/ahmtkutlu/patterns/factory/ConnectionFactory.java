package org.ahmtkutlu.patterns.factory;

public class ConnectionFactory {

    public static Connection getConnection(String host, String port, String user, String password) {

        Connection connection;

        if ("1521".equalsIgnoreCase(port)){
            connection = new OracleConnection(host, port, user, password);
        } else if("5432".equalsIgnoreCase(port)){
            connection = new PostgresConnection(host, port, user, password);
        } else {
            throw new RuntimeException("Invalid port!");
        }

        return connection;
    }

}