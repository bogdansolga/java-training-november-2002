package com.training.d04.s01;

import com.training.model.Fish;
import com.training.model.Laptop;
import com.training.model.Product;

import java.util.ArrayList;
import java.util.List;

public class GenericsMain {

    public static void main(String[] args) {
        StackOfProducts stackOfProducts = new StackOfProducts();
        stackOfProducts.add(new Product(1, "Coffee"));

        List<Product> listOfItems = new ArrayList<>();
        //listOfItems.add(new Fish("Nemo")); // not possible --> the list contains Products, not Objects
        listOfItems.add(new Laptop(1, "IBM"));
        listOfItems.add(new Product(10, "Something"));

        List<?> listOfSomeItems = getListOfItems();
        displayList(listOfItems);
        displayList(getListOfItems());
    }

    private static List<?> getListOfItems() {
        List items = new ArrayList(); // a list of objects

        return items;
    }

    private static <Type> void displayList(List<Type> items) {

    }
}
