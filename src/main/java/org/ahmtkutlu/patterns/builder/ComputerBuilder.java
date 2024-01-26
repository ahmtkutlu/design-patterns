package org.ahmtkutlu.patterns.builder;

public class ComputerBuilder {

    private int ram;
    private int capacity;
    private int price;
    private String brand;
    private String model;
    private boolean freedos;
    private boolean desktop;

    public static ComputerBuilder startLaptopBuild(){
        return new ComputerBuilder();
    }

    public static ComputerBuilder startDesktopBuild(){
        return new ComputerBuilder().setDesktop(true);
    }

    public Computer build() {
        Computer computer = new Computer();
        computer.setRam(ram);
        computer.setCapacity(capacity);
        computer.setPrice(price);
        computer.setBrand(brand);
        computer.setModel(model);
        computer.setFreedos(freedos);
        computer.setDesktop(desktop);
        return computer;
    }

    public ComputerBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public ComputerBuilder setCapacity(int capacity) {
        this.capacity = capacity;
        return this;
    }

    public ComputerBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    public ComputerBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public ComputerBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public ComputerBuilder setFreedos(boolean freedos) {
        this.freedos = freedos;
        return this;
    }

    public ComputerBuilder setDesktop(boolean desktop) {
        this.desktop = desktop;
        return this;
    }
}