package easy_problems_on_arrays;
//lomuto's partition scheme
public class evenorodd {
    public static void EvenOrOdd(int arr[], int n){
        int i = -1;
        for (int j = 0; j < n; j++) { // Use a for loop for array iteration
            if (arr[j] % 2 == 0) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Print the modified array
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }



    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 4, 7, 6, 9, 10};
        int n = arr.length;
        EvenOrOdd( arr,  n);

    }
}
