import java.util.Scanner;
public class Main
{
    public static void pip(int n){
        if(n==0) return ;
        System.out.print(n+" ");
        pip(n-1);
        System.out.print(n+" ");
        pip(n-1);
        System.out.print(n+" ");
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the number : ");
	    int n = sc.nextInt();
	    pip(n);
	}
}
