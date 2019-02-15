//  Justin Lazarski
//  CIS3090.04
//  2/5/19
//  In class assigment 1
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scnr = new Scanner(System.in);
        Double score;
        String grade;
        score = scnr.nextDouble();

        if(score < 60) {
            grade = "F";
            System.out.println(grade);
        }
        else if(score < 70 ) {
            grade = "D";
            System.out.println(grade);
        }
        else if(score < 80) {
            grade = "C";
            System.out.println(grade);
        }
        else if(score < 90) {
            grade = "B";
            System.out.println(grade);
        }
        else if(score < 100) {
            grade = "A";
            System.out.println(grade);

        }
    }
}
