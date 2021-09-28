package com.company;

public class Bed extends Furniture{
    float width, length;

    public Bed(boolean enable, String color, String material, int price, String name, float width, float length) {
        super(enable, color, material, price, name);
        this.width = width;
        this.length = length;
    }

    @Override
    String printSize() {
        return "width: "+width+"length: "+length;
    }

    @Override
    public String info() {
        return  name+'\n'+printSize()+'\n'+
                color + '\n' +
                "bed material is" + material + '\n' +
                "price: " + price;
    }
}
