import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
    public static boolean IsPowerOf2(int num){
        if(num==1) return true;
        if(num/2==1) return true;
        if(num%2==1) return false;
        return IsPowerOf2(num/2);
    }
    // Given a positive integer, return true if it is a power of 2.
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		System.out.println(IsPowerOf2(n));
		
	}
}
