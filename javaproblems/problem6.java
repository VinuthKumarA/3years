package javaproblems;
import java.util.Scanner;
public class problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char op = sc.next().charAt(0);
        int c = sc.nextInt();

        switch(op){
            case '+':
                System.out.println(a+c);
                break;
            case '-':
                System.out.println(a-c);
                break;
            case '*':
                System.out.println(a*c);
                break;
            case '/':
                System.out.println(a/c);
                break;
            default:
                System.out.println("invalid character");
        }

    }
}
