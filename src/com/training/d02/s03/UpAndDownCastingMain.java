package com.training.d02.s03;

import com.training.model.Laptop;
import com.training.model.Product;

public class UpAndDownCastingMain {

    public static void main(String[] args) {
        Product theProduct = new Product(20, "Phone");
        Laptop theLaptop = new Laptop(30, "Dell Inspiron");

        Laptop anotherLaptop = (Laptop) theProduct;     // down-casting
        Product anotherProduct = (Product) theLaptop;   // up-casting
    }
}
