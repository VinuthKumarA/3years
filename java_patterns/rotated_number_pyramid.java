package java_patterns;

import java.util.Scanner;

public class rotated_number_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no of rows: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for (int j=i;j<=2*i-1;j++){
                System.out.print(j);

            }

            System.out.println(" ");
        }
    }

}
