package com.company;

public class Chair extends Furniture{
    public Chair(boolean enable, String color, String material, int price, String name) {
        super(enable, color, material, price, name);
    }

    @Override
    String printSize() {
        return "";
    }
    @Override
    public String info() {
        return  name+'\n'+printSize() + color + '\n' +
                "chair material is" + material + '\n' +
                "price: " + price;
    }
}
