package easy_problems_on_arrays;

import java.util.Scanner;

public class primenocheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no  = ");
        int num = sc.nextInt();
        boolean isprime = true;
        if(num<=1){
            isprime=false;
        }else{
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%2==0){
                    isprime=false;
                }
            }
        }

        if(isprime){
            System.out.println("its a prime no");
        }else{
            System.out.println("its is not a prime no");
        }
    }

}
