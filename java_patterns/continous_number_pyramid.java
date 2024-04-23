package java_patterns;

import java.util.Scanner;

public class continous_number_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the order of rows: ");
        int n = sc.nextInt();
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count);
                count++;
            }
            System.out.println(" ");
        }
    }
}
