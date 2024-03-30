package javaproblems;
import java.util.Scanner;
public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the cost price : ");
        int cp = sc.nextInt();
        System.out.println("enter the sell price : ");
        int sp = sc.nextInt();
        if(sp>cp){
            System.out.println("profit"+" : "+(sp-cp));
        } else if (sp<cp) {
            System.out.println("loss"+" : "+(sp-cp));
        }else{
            System.out.println("no profit or loss");
        }
    }

}
