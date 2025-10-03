import java.util.Scanner;
public class Main
{
    public static void print(int n){
        if(n==0) return;
        System.out.print(n+"\t");
        print(n-1);
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a number : ");
	    int num = sc.nextInt();
	    print(num);
	}
}
