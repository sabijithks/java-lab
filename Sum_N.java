//A Program to find the sum of first “n” natural numbers
import java.io.*;
import java.util.*;
public class Sum_N {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of Natural numbers to find sum");
        int num = scan.nextInt();
        int arr[] = new int[num]; 
        int sum=0;
        //reading the array
        for (int i = 0; i < num; i++) {
            arr[i] = i+1;
        }
        //finding the sum
        for (int i = 0; i < num; i++) {
            sum+=arr[i];
        }
        System.out.printf("The sum of 1st %d natural numbers are : %d ",num,sum);
        scan.close();
    }
}