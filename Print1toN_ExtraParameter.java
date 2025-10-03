import java.util.Scanner;
public class Main
{
    public static void print(int num,int n){
        if(n==0) return;
        print(num,n-1);
        System.out.print(n+"\t");
    }
    public static void printOne(int num,int n){
        if(n==num+1) return;
        System.out.print(n+"\t");
        printOne(num,n+1);
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a number : ");
	    int num = sc.nextInt();
	    print(num,num);
	    System.out.println();
	    printOne(num,1);
	}
}
