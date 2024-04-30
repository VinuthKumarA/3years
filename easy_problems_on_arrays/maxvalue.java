package easy_problems_on_arrays;

import java.util.Scanner;

public class maxvalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the arr size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the values: ");
        for (int i=0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }
        int mx= arr[0];
        for (int i=1;i<n;i++){
            if(arr[i]>mx) mx= arr[i];
        }
        System.out.println(mx);
    }
}
