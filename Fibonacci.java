
//A Program to find the fibonacci series 
import java.io.*;
import java.util.*;

public class Fibonacci {
    int fib(int n) {
        if (n <= 1)
            return 1;
        else if (n > 1)
            return (fib(n - 1) + fib(n - 2));
        else
            return -1;
    }

    public static void main(String[] args) throws IOException {
        Fibonacci fb = new Fibonacci();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many numbers are needed : ");
        int num = scan.nextInt();
        System.out.printf("Fibonacci series upto %d numbers are : \n", num);
        System.out.print("1 1 ");
        for (int i = 0; i < num; i++) {
            if (fb.fib(i) != -1) {
                System.out.print(fb.fib(i));
                System.out.printf(" ");
            } else {
                System.out.println("Unknown");
                break;
            }
        }
        scan.close();
    }
}
