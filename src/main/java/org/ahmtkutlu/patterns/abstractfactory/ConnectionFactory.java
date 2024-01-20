package org.ahmtkutlu.patterns.abstractfactory;

public interface ConnectionFactory {
    Connection connect(String host, String port, String user, String password);
}
