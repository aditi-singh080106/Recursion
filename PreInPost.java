import java.util.Scanner;
public class Main
{
    public static void pip(int n){
        if(n==0) return ;
        System.out.print("pre: "+n+" "); // pre
        pip(n-1);
        System.out.print("in: "+n+" "); // in
        pip(n-1);
        System.out.print("post: "+n+" "); // post
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the number : ");
	    int n = sc.nextInt();
	    pip(n);
	}
}
