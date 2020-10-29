import java.io.*;
import java.util.Scanner;
import java.lang.Math;
public class angstrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        int num = scanner.nextInt();
        int temp =num;
        int y =0;
        String z = Integer.toString(num);
        int c = (int) z.length();
        while (temp !=0)
        {
            int x = temp%10;
            y +=(Math.pow(x,c));
            temp/=10;
        }
        if (y==num)
        {
            System.out.println("Angstrome");
        }
        else
        System.out.println("Not Angstrome");

    }
}
