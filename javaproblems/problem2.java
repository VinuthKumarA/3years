package javaproblems;
import java.util.Scanner;
public class problem2 { //find least number in 3 given no
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first no : ");
        int a = sc.nextInt();
        System.out.println("enter the second no : ");
        int b = sc.nextInt();
        System.out.println("enter the third no : ");
        int c = sc.nextInt();
        if(a<b && a<c){
            System.out.println(a + " is least no");
        } else if (b<a && b<c) {
            System.out.println(b +" is least no");
        }else {
            System.out.println(c +" is least no");
        }
    }
}
