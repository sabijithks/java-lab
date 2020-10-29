//A Program to find the factorial of a given number
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int prd =1;
        for (int i = num; i >= 1; i--) {
            prd*=i;
        }
        System.out.printf("The factorial of %d is %d",num,prd);
        scanner.close();
    }
    
}
