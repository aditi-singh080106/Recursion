import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
    public static void sumOfOdd(int n1 ,int n2 , int sum){
        if(n1 > n2){
            System.out.println("Sum of odd number in range : "+sum);
            return;
        }
        if(n1%2==1) sumOfOdd(n1+1,n2,sum+n1);
        else sumOfOdd(n1+1,n2,sum);
    }
    // Write a program to calculate the sum of odd numbers between a and b (both inclusive) using recursion.
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd number : ");
		int num2 = sc.nextInt();
		sumOfOdd(num1,num2,0);
		
	}
}
