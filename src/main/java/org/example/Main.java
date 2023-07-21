package org.example;


import static org.example.APCE_demo.getyear;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello APCE");

        APCE_demo check = new APCE_demo();
        System.out.println(check.getname());
        System.out.println(getyear());
    }
}
