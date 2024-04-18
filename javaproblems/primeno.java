package javaproblems;

import java.util.Scanner;

public class primeno {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no:");
        int n=sc.nextInt();
        int a=0;
        for (int i=2;i<=n-1;i++){
            if(n%i==0){
                System.out.println("it is a composite no");
                a++;
                break;
            }
        }
        if(a==0){
            System.out.println("it is a prime no ");
        }
    }
}
