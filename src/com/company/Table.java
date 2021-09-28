package com.company;

public class Table extends Furniture{
    int size;

    public Table(boolean enable, String color, String material, int price, String name, int size) {
        super(enable, color, material, price, name);
        this.size = size;
    }

    @Override
    String printSize() {
        return "for "+size+" people";
    }
    @Override
    public String info() {
        return  name+'\n'+printSize()+'\n'+
                 color + '\n' +
                "table material is " + material + '\n' +
                "price: " + price;
    }
}
