//check given no is palindrome or not
import java.io.*;
import java.util.*;
import java.lang.Math;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to test palindrome");
        int num = scanner.nextInt();
        int temp = num;
        int y=0;
        String z = Integer.toString(num);
        int c = (int) z.length();
        c-=1;
        while(temp !=0)
        {
            int x = temp%10;
            y = y + (x * (int) Math.pow(10, c));
            System.out.println(y);
            c-=1;
            temp=temp/10;
        }
        if(y==num)
        {
        	System.out.println("Palindrome");
        }
        else
        	System.out.println("Not Palindrome");
        scanner.close();
    }
    
}
