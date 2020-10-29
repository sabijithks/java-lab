//A Program to find the factorial of 1st n numbers
import java.io.*;
import  java.util.*;
public class factorialFirstN {

    public static int fact(int n)
    {
        int prd =1;
        for (int i = n; i >= 1; i--) {
            prd*=i;
        }
        return prd;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many numbers are there to find the factorial : ");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.printf("factorial of %d is %d \n",i,fact(i));
        }
        scanner.close();
    }
}
