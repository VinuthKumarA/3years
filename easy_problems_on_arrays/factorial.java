package easy_problems_on_arrays;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the num = ");
        int num = sc.nextInt();
        long fact = 1;
        for(int i= num;i>=1;i--){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
