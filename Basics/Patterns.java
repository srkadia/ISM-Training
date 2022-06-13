import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();
        int i=0;
        while (i < n) {
            int k = n;
            while (k > i) {
                System.out.print(" ");
                k--;
            }
            int j = 0;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println("");
            i++;
        }

    }
}

/*
 * 1. hollow square
 * 
 * int i=0;
        while (i < n) {
            int j=0;
            while (j < n) {
                if (i == 0 || i == n-1 || j == 0 || j == n-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                j++;
            }
            System.out.println("");
            i++;
        }    
 * 
 * 2. hollow rectangle
 * 
 * 
 * 
 */