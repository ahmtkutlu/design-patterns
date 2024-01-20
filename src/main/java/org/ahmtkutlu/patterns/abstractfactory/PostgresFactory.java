package org.ahmtkutlu.patterns.abstractfactory;

public class PostgresFactory implements ConnectionFactory{
    @Override
    public Connection connect(String host, String port, String user, String password) {
        return new PostgresConnection(host,port,user,password);
    }
}
