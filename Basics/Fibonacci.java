import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89.
        System.out.println("Enter a number(max limit 10): ");
        int a = 0, b = 1, temp, n = sc.nextInt();
        sc.close();

        System.out.print("Fibonacci series: " + a + ", " + b + ", ");
        for (int i = 1; i <= n; i++) {
            temp = a;
            a = b;
            b = temp + b;
            System.out.print(b + ", ");
        }
        sc.close();
    }
}
