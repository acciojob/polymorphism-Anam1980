package com.driver;

public class Main {

    public static class Product{
        public int product(int x, int y) {
            return x*y;
        }
        public int product(int x, int y, int z) {
            return x*y*z;
        }
        public double product(double x, double y) {
            return x*y;
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