import java.util.Scanner;

public class MultiArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mArray = new int[3][4];

        for (int i = 0; i < mArray.length; i++) {
            for (int j = 0; j < mArray[i].length; j++) {
                //scan
                System.out.println("mArray[" + i + "][" + j + "] = ");
                mArray[i][j] = sc.nextInt();
            }
        }
        sc.close(); //optional
        
        //print
        System.out.println("\n\n");
        for (int i = 0; i < mArray.length; i++) {
            for (int j = 0; j < mArray[i].length; j++) {
                // System.out.println("mArray[" + i + "][" + j + "] = " + mArray[i][j]);
                // System.out.printf("%5d", mArray[i][j]);
                System.out.print(mArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
