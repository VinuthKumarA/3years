package java_patterns;

import java.util.Scanner;

public class alphabet_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the rows: ");
        int n = sc.nextInt();
        int alphabet= 65;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(alphabet+i));
            }
            System.out.println(" ");
        }
    }
}
