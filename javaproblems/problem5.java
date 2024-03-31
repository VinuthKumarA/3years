package javaproblems;
import java.util.Scanner;
public class problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first no : ");
        int a = sc.nextInt();
        System.out.println("enter the second no : ");
        int b = sc.nextInt();
        System.out.println("enter the third no : ");
        int c = sc.nextInt();

        if((a+b)>c && (b+c)>a && (c+a)>b) System.out.println("triangle sides");
        else System.out.println("not sides");
    }

}
