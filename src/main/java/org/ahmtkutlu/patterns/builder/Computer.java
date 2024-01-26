package org.ahmtkutlu.patterns.builder;

public class Computer {

    private int ram;
    private int capacity;
    private int price;
    private String brand;
    private String model;
    private boolean freedos;
    private boolean desktop;

    public Computer() {
    }

    public Computer(int ram, int capacity, int price, String brand, String model, boolean freedos, boolean desktop) {
        this.ram = ram;
        this.capacity = capacity;
        this.price = price;
        this.brand = brand;
        this.model = model;
        this.freedos = freedos;
        this.desktop = desktop;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isFreedos() {
        return freedos;
    }

    public void setFreedos(boolean freedos) {
        this.freedos = freedos;
    }

    public boolean isDesktop() {
        return desktop;
    }

    public void setDesktop(boolean desktop) {
        this.desktop = desktop;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram +
                ", capacity=" + capacity +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", freedos=" + freedos +
                ", desktop=" + desktop +
                '}';
    }
}