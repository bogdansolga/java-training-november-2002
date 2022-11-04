package com.training.d01.s04;

import com.training.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductMain {

    public static void main(String[] args) {
        Product telefon = createProduct(20, "Telefon");
        System.out.println("The first product is a " + telefon.getName());

        Product înghețată = createProduct(10, "Înghețată");
        System.out.println("The second product is an '" + înghețată.getName() + "'");

        // an array of products
        Product[] products = {telefon, înghețată};  // fixed size

        // a collection of products
        List<Product> productList = new ArrayList<>(1); // dynamic size
        productList.add(telefon);
        productList.add(înghețată);

        Product x = null; // a variable of type Product, not initialized (there is no 'new Product()')
        System.out.println(x.getName());
    }

    private static Product createProduct(int id, String name) { // Shift + F6 --> Rename
        Product theProduct = new Product();
        theProduct.setId(id);
        theProduct.setName(name);
        return theProduct;
    }
}
