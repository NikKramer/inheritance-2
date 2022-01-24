package com.company;

public class Main {


    public static void main(String[] args) {

        double temp = -20.3;

        System.out.println(Celsius.GetTemp(temp));
        System.out.println(Fahrenheit.GetTemp(temp));
        System.out.println(Kelvin.GetTemp(temp));
    }
}
