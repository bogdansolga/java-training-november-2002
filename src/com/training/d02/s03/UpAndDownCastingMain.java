package com.training.d02.s03;

import com.training.model.Laptop;
import com.training.model.Product;

import static com.training.model.Product.TABLE_NAME; // importing just a property or method, not the entire class

public class UpAndDownCastingMain {

    public static void main(String[] args) {
        Product theProduct = new Product(20, "Phone");
        Laptop theLaptop = new Laptop(30, "Dell Inspiron");

        //Laptop anotherLaptop = (Laptop) theProduct;     // down-casting --> ClassCastException
        Product anotherProduct = (Product) theLaptop;   // up-casting

        System.out.println(theLaptop instanceof Product);
        System.out.println("The products are saved in the " + TABLE_NAME + " table");
    }
}
