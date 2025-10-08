import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
    static ArrayList<String> arr ;
    public static void  parenthesis(String s , int n , int open , int close){
        if(s.length()==2*n){
            arr.add(s);
            return;
        }
        if(open<n||s.length()==0) parenthesis(s+"(",n, open+1,close);
        if(open>close) parenthesis(s+=")",n, open, close+1);
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		arr = new ArrayList<>();
		int n = sc.nextInt();
		parenthesis("",n,0,0); //n , open , , close
		System.out.print(arr);
	}
}
