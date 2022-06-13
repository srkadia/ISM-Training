import java.util.*;

public class Searching {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be searched: ");
        int index = -1, element = sc.nextInt();

        //binary searching
        Arrays.sort(arr);
        // Arrays.binarySearch(arr, element);
        int low = 0, high = arr.length - 1, flag = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == element) {
                flag = 1;
                index = mid;
                break;
            } else if (arr[mid] < element) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (flag == 1) {
            System.out.println("The element is present at index " + index);
        } else {
            System.out.println("The element is not present in the array");
        }
        sc.close();
    }
}
