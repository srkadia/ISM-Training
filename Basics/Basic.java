import java.util.Scanner;

class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //151, 1221, 12321
        System.out.println("Enter a number: ");
        int sum = 0, temp, n = sc.nextInt();
        sc.close();
        temp = n; //temp = 151

        for (; temp > 0;) {
            int rem;
            rem = temp % 10; //rem = 151%10 = 1
            sum = sum * 10 + rem; //sum = 0*10 + 1 = 1
            temp = temp / 10; //temp = 151/10 = 15
        }
        
        if (sum == n) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}

/* 
control statements:
if, else if, else, switch, while, do-while, for

if statement:

types of if statements:
1. if Statement

syntax -: 

if (condition) {
    // statements
}

-> here if condition is true, then it will execute the statements


2. if-else Statement
3. if-else-if Statement
4. nested-if Statement
-------------------------------------------------

Switch case -: 

syntax->
    switch(expression) {
        case value1:
            // statements
            break;
        case value2:
            // statements
            break;
        default:
            // statements
    }
-------------------------------------------------------    
LOOPS-> loops are used to execute the same statement multiple times
iteration -: iteration is the process of repeating the same process multiple times

types of loops->
1. for loop
2. while loop
3. do-while loop
4. foreach loop -> advanced for loop


Tasks-: 
1. age> 18 --> eligible for voting
2. HOTELMENU Oberoi

*/