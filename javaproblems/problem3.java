package javaproblems;

import java.util.Scanner;
public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first no : ");
        int a = sc.nextInt();
        System.out.println("enter the first no : ");
        int b = sc.nextInt();
        System.out.println("enter the first no : ");
        int c = sc.nextInt();
        if(a>b) {
            if (a > c){
                System.out.println(a + "is greater no");
            }
            else{
                System.out.println(c + "is greater no");
            }
        }
        else {
            if (b > c) {
                System.out.println(b + "is greater no");
            } else {
                System.out.println(c + "is greater no");
            }
        }
    }
}
