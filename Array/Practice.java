import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];

        int sum = 0; 
        for (int i = 0; i < size; i++) {
            System.out.print("\nEnter any number: ");
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }
        sc.close();
        
        //foreach loop
        int i = 0;
        for (int var : numbers) {
            System.out.println("numbers[" + i + "] = " + var);
            i++;
        }
        System.out.println(sum);
    }
}