package com.company;

abstract public class Furniture {
    boolean enable;
    String color;
    String material;
    String name;
    int price;
    void isEnable()
    {
        if(enable) System.out.println("Enable");
        else System.out.println("Not enable");;
    }
    abstract String printSize();

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Furniture(boolean enable, String color, String material, int price, String name) {
        this.enable = enable;
        this.color = color;
        this.material = material;
        this.price = price;
        this.name = name;
    }
    public void printName()
    {
        System.out.println(name);
    }
    public abstract String info();
}
