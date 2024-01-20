package org.ahmtkutlu.patterns.abstractfactory;

public class OracleFactory implements ConnectionFactory{
    @Override
    public Connection connect(String host, String port, String user, String password) {
        return new OracleConnection(host, port, user, password);
    }
}
