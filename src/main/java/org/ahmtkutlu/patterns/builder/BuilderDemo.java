package org.ahmtkutlu.patterns.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        Computer macBook =  ComputerBuilder.startLaptopBuild()
                .setBrand("Apple")
                .setModel("MacBook Pro")
                .setCapacity(256)
                .setFreedos(false)
                .setRam(16)
                .setPrice(2000)
                .build();

        Computer asusDesktop =  ComputerBuilder.startDesktopBuild()
                .setBrand("Asus")
                .setModel("Gaming Series X970A")
                .setCapacity(1000)
                .setFreedos(false)
                .setRam(32)
                .setPrice(4000)
                .build();

        print(macBook);
        print(asusDesktop);
    }

    public static void print(Computer computer) {

        System.out.println("Computer added to the store: " + computer);

    }

}