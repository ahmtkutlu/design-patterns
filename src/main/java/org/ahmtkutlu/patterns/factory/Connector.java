package org.ahmtkutlu.patterns.factory;

public class Connector {
    public static void main(String[] args) {

        Connection oracleConnection = ConnectionFactory.getConnection("localhost","1521", "root", "********");

        Connection postgresConnection = ConnectionFactory.getConnection("localhost","5432", "root", "********");

        oracleConnection.connect();

        postgresConnection.connect();
    }
}