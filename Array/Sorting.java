import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("\nThe unsorted array is: ");
        for (int i : arr) {
            System.out.println("Arr = " + i);
        }

        // Sort the array
        // Arrays.sort(arr);

        // Bubble sort
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }


        System.out.println("\nThe sorted array is: ");
        for (int i : arr) {
            System.out.println("Arr = " + i);
        }

        sc.close();
    }
}
