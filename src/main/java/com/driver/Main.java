package com.driver;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String []args){
        Product p=new Product();
        System.out.println(p.product(3,4));
        System.out.println(p.product(3,4,5));
        System.out.println(p.product(3.1,4.2));

    }
    class Product{
        public int product(int x, int y){
            return x*y;
        }
        public double product(double x, double y){
            return x*y;
        }
        public int product(int x, int y, int z){
            return x*y*z;
        }
    }

}
