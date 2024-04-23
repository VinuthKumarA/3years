package java_patterns;

import java.util.Scanner;

public class simple_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no:");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }


    }
}
