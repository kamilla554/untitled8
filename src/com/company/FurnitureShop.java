package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class FurnitureShop {
    ArrayList<Furniture> basket=new ArrayList<Furniture>();
    ArrayList<Chair> chairs;
    ArrayList<Bed> beds;
    ArrayList<Table> tables;

    public void shop()
    {
        System.out.println("You are in furniture shop!"+'\n'+"What do you want to look at?:"+'\n'
                +"Press 1 to look at tables"+'\n'+"Press 2 to look at chairs"+'\n'+"Press 3 to look at beds"+);
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num>3) {
            System.out.println("you pressed wrong number! Try again");
            shop();
        }
            else
        {
            if (num==3) bedsShop();
            else
            {
                if (num==2) chairsShop();
                else tablesShop();
            }
        }
        in.close();
    }
    void bedsShop()
    {
        System.out.println("Beds");
        
    }

}
