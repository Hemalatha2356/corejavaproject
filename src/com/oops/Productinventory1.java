package com.oops;
import java.util.Arrays;

public class Productinventory1 {

    static Productinventory[] product = new Productinventory[3];
    private int count = 0;

    void additem(int id, String name, int quantity, int price) {

        Productinventory p1 = new Productinventory(id, name, price, quantity);
        product[count] = p1;
        count++;
    }

    public static void main(String[] args) {

        Productinventory1 obj = new Productinventory1();

        obj.additem(101, "Laptop", 10, 50000);
        obj.additem(102, "Mobile", 20, 20000);
        obj.additem(103, "Tablet", 15, 30000);

        System.out.println("main method started");
        System.out.println("product info");

        System.out.println(Arrays.toString(product));
    }


}
