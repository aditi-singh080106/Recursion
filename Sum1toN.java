import java.util.Scanner;
public class Main
{
    public static void printSum(int n,int sum){
      if(n==0){
        System.out.println(sum);
        return;
      }
      printSum(n-1,sum+n);
    }
    public static int sum(int n,int sum){
        if(n<=1) return sum+n;
        return sum(n-1,sum+n);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		System.out.println("Sum is : "+sum(num,0));
	}
}
