import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
    public static void countAndSay(String s , String ans , int count , int val ,int idx){
        if(s.length()==idx){
            ans=ans+count+val;
            System.out.println(ans);
            return;
        }
        if(val==s.charAt(idx)-'0') countAndSay(s,ans,count+1,val,idx+1);
        else{
            ans=ans+count+val;
            val = s.charAt(idx)-'0';
            countAndSay(s,ans,1,val,idx+1);
        }
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numbers :  ");
		String s = sc.nextLine();
		countAndSay(s,"",0,s.charAt(0)-'0',0);
	}
}
