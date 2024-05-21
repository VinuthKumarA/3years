package easy_problems_on_arrays;

import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number = ");
        int num = sc.nextInt();
        int reversed = 0;
        while(num!=0){
            reversed = reversed*10+ num%10;
            num/= 10;
        }
        System.out.println(reversed);
    }
}
