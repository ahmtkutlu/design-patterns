package org.ahmtkutlu.patterns.abstractfactory;

public class Connector {

    public static void main(String[] args) {
        OracleFactory oracleFactory = new OracleFactory();
        Connection oracleConnection = oracleFactory.connect("localhost","1521", "root", "********");

        PostgresFactory postgresFactory = new PostgresFactory();
        Connection postgresConnection = postgresFactory.connect("localhost","1521", "root", "********");

        oracleConnection.connect();
        postgresConnection.connect();

    }

}