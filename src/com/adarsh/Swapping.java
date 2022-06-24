package com.adarsh;

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = in.nextInt();
        System.out.println("Enter the second number: ");
        int b = in.nextInt();

        /*int temp = a;
        a = b;
        b = temp;*/
        swap(a,b);

        /*System.out.println("The Two numbers after swapping are: " + a + " " + b);*/
    }
    static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("The Two numbers after swapping are: " + a + " " + b);
    }
}
