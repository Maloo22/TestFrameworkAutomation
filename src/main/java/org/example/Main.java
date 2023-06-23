package org.example;


import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Main {
    public static void main(String[] args) {

/*       Homework:
         1. Create a Java program that will print a welcome message with dynamic data variables.
         Use String, int and double data variables.

         include next information:
         - username or firstname
         - age
         - location (state or city)
         - product name
         - price
 */

        String customerName = "Deer";
        int customerAge = 151;
        double distance = 38.957;
        String placeToGet = "Olympus";
        String prodName = "three-wheeled children's bicycle";
        double price = 100500.99;
        String currency = "Yen";


        System.out.println("Dear "+ customerName +", since you are "+customerAge+" years old today and an honorary resident of Madagascar, you are entitled to a prize in the form of a "+prodName+". ");
        System.out.println("You can pick it up at our drop-off point on the planet Mars, "+distance+" kilometers north of "+placeToGet+". You can get it absolutely free, for only "+price+" Martian "+currency+". The landmark is the NASA Curiosity rover stuck in the sands.");










        /*
        2. Make 4 different math operations using int data variable. Print your result to console.
        */


        int first = 6;
        int second = 9;
        int third = 4;
        int fourth = 15;

        double one = 15.16;
        double two = 37.482;
        double three = 9658.2;
        double four = 15.23632;


        System.out.println(first + (second - third) - fourth);
        System.out.println(one + two);
        System.out.println(three / (9 * first));
        System.out.println(Math.floor(four * (fourth + 4) - (second + two)));





    }

}