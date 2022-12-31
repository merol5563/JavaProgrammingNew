package day43_Abstraction;

import java.util.Scanner;

public class Trow_vs_Trows {

    public static void main(String[] args) {

        System.out.println("Enter your score:");
        int score = new Scanner(System.in).nextInt();

       if (score < 0 || score <100){
           throw new RuntimeException("Invalid score: " +score);// exit(1)
       }


       if(score < 90) if (score >= 80) {
           System.out.println("B");
       } else if (score >= 70) {
           System.out.println("C");
       } else if (score >= 60) {
           System.out.println("D");
       } else {
           System.out.println("F");
       }else {
           System.out.println("A");
           }

       //method(1);

       }


    public static void method1() throws InterruptedException {
        Thread.sleep(5000);

    }
    }

