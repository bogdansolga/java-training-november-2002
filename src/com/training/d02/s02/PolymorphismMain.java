package com.training.d02.s02;

import com.training.model.Laptop;
import com.training.model.Product;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismMain {

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(20, "Tablet"));
        productList.add(new Laptop(30, "IBM ThinkPad X1"));

        for (Product product : productList) {
            product.process();

            if (product instanceof Laptop) {
                Laptop theLaptop = (Laptop) product; // down-casting
            }
        }
    }
}
