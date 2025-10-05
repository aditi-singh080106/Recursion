import java.util.Scanner;
public class Main
{
    public static void remove_a(String s , String ans,int idx){
        if(idx==s.length()){
            System.out.println(ans);
            return;
        }
        if(s.charAt(idx)!='a') ans+= s.charAt(idx);
        remove_a(s,ans,idx+1);
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String s = "My name is aditi singh..!";
	    remove_a(s,"",0);
	}
}
