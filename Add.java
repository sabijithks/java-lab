//A program to add two numbers
import java.io.*;
import java.util.Scanner;
public class Add {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter the two numbers to be added : \n");
        int var1 = scan.nextInt();
        int var2 = scan.nextInt();
        System.out.printf("%d + %d = %d \n",var1,var2,var1+var2);
        scan.close();
    }
}
