import java.util.Scanner;
public class Main
{
    public static int fibo(int num){
        if(num <= 1 ) return num;
        return fibo(num-1)+fibo(num-2);
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the number :");
	    int n = sc.nextInt();
	    System.out.println("Fibonaci number is :"+fibo(n));
	    
	}
}
