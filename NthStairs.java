import java.util.Scanner;
public class Main
{
    public static int jump3(int n){
        if(n<=2) return 1;
        if(n==3) return 2;
        return jump3(n-1)+jump3(n-3);
    } // 1 or 3 jumps allowed
    public static int stair(int n){
        if(n<=2) return n;
        return stair(n-1)+stair(n-2);
    } // 1 or 2 jumps allowed
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter number of stairs : ");
	    int n=sc.nextInt();
	    System.out.println("Number of total ways to climb : "+stair(n));
	    System.out.println("Number of total ways to climb : "+jump3(n));
	    
	}
}
