import java.util.Scanner;
public class Main
{
    public static void subset(String str , int idx , String ans){
        if(idx==str.length()) {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(idx);
        subset(str,idx+1,ans);    //  not taken
        subset(str,idx+1,ans+ch); //  taken
    }
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter a string : ");
	    String str = sc.nextLine();
	    subset(str , 0 , "");
	}
}
