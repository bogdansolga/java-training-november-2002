package com.training.d01.s04;

import com.training.d01.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductMain {

    public static void main(String[] args) {
        Product first = createProduct(20, "Phone");
        System.out.println("The first product is a " + first.getName());

        Product second = createProduct(10, "Ice cream :-)");
        System.out.println("The second product is an '" + second.getName() + "'");

        // an array of products
        Product[] products = {first, second};

        // a collection of products
        List<Product> productList = new ArrayList<>();
        productList.add(first);
        productList.add(second);
    }

    private static Product createProduct(int id, String name) { // Shift + F6 --> Rename
        Product product = new Product();
        product.setId(id);
        product.setName(name);
        return product;
    }
}
