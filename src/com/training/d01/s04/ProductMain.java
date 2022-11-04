package com.training.d01.s04;

import com.training.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductMain {

    public static void main(String[] args) {
        Product telefon = createProduct(20, "Telefon");
        //System.out.println("The first product is a " + telefon.getName());

        Product înghețată = createProduct(10, "Înghețată");
        //System.out.println("The second product is an '" + înghețată.getName() + "'");

        // an array of products
        Product[] products = {telefon, înghețată};  // fixed size
        Product[] another = new Product[5]; // an array of length 5, without any items in it
        another[3] = telefon;

        // for (data-type variable-name : iterated-collection-or-array)
        for (Product product : another) {
            System.out.println(product);
        }

        // a collection of products
        List<Product> productList = new ArrayList<>(1); // dynamic size
        productList.add(telefon);
        productList.add(înghețată);

        Product x = null; // a variable of type Product, not initialized (there is no 'new Product()')
        System.out.println(x.getName());

        // invoking a static method
        Product staticallyCreated = Product.createProduct(20, "Flight ticket");
    }

    private static Product createProduct(int id, String name) { // Shift + F6 --> Rename
        Product theProduct = new Product(id, name);
        //theProduct.setId(id); --> cannot be set anymore
        //theProduct.setName(name);
        return theProduct;
    }
}
