package com.training.d02.s01;

import com.training.model.Laptop;

public class LaptopMain {

    public static void main(String[] args) {
        Laptop cosminsLaptop = new Laptop();
        cosminsLaptop.setSerialNumber("sd8d328edsa");
        cosminsLaptop.start();

        Laptop dragosLaptop = new Laptop();
        dragosLaptop.setSerialNumber("dsa7dhasuh382");
        dragosLaptop.start();
    }
}
