import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
    public static int stair(int n){
        if(n<0) return 0;
        if(n==0) return 1;
        if(n<=2) return n;
        if(n==3) return n+1;
        return stair(n-1)+stair(n-2)+stair(n-3);
    }
// Calculate the number of ways in which a person can climb n stairs if he can take exactly 1, 2 or 3 steps at each level.
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of stairs : ");
		int n = sc.nextInt();
		System.out.println(stair(n));
		
	}
}
