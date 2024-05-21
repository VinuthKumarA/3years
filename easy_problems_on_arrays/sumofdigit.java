package easy_problems_on_arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the num =");
        int num = sc.nextInt();
        int sum=0;
        while(num!=0){
             sum = sum + num%10;
            num = num/10;
        }
        System.out.println(sum);
    }
}
