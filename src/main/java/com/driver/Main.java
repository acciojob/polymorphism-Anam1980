package com.driver;

public class Main {

    public static class Product{
        public int product(int x, int y) {
            return 1;
        }
        public int product(int x, int y, int z) {
            return 2;
        }
        public double product(double x, double y) {
            return 3.0;
        }
    }

    public static  void main(String[]args){
        Product p = new Product();
        //task 2
        p.product(0,1);

        //task 3
        p.product(1,1,1);

        //task 4
        p.product(44.5,5.5);

    }
}