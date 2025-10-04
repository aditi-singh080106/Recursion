import java.util.Scanner;
public class Main
{
    public static int pow(int a , int b){
        if(b==0) return 1;
        int ans = pow(a,b/2);
        if(b%2==0) return ans*ans;
        else return ans*ans*a;
    } // TC : O(log(b))
    public static int power(int a , int b){
        if(b==0) return 1;
        return a*power(a,b-1);
    } // TC : O(b)
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the base :");
	    int a = sc.nextInt();
	    System.out.print("Enter the exponent : ");
	    int b = sc.nextInt();
	    System.out.println("Value is : "+pow(a,b));
	    
	}
}
