package com.training.d02.s01;

import com.training.model.Laptop;

public class LaptopMain {

    public static void main(String[] args) {
        Laptop cosminsLaptop = new Laptop(1, "IBM X1");
        cosminsLaptop.setSerialNumber("sd8d328edsa");
        cosminsLaptop.start();

        Laptop dragosLaptop = new Laptop(1,"Dell Inspiron 3501");
        dragosLaptop.setSerialNumber("dsa7dhasuh382");
        dragosLaptop.start();
    }
}
