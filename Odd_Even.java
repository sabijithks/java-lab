import java.io.*;
import java.util.*;
public class Odd_Even {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter a number to be checked : \n");
        int num = scan.nextInt();
        //Checking if num is odd or even
        if (num % 2 ==0)
        System.out.printf("%d is an even number \n",num);
        else 
        System.out.printf("%d is an odd number \n",num);
        scan.close();
    }
}
