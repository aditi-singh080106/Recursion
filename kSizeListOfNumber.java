import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
    static ArrayList<String> list ;
    public static void kSizeListOfNumber(String str , int idx ,String ans ,int k){
        if(idx==str.length()||ans.length()==k){
            if(ans.length()==k) list.add(ans);
            return;
        }
        kSizeListOfNumber(str,idx+1,ans,k);
        ans+=str.charAt(idx);
        kSizeListOfNumber(str,idx+1,ans,k);
        
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a number : ");
	    int n = sc.nextInt();
	    String str = "";
	    for(int i = 1 ; i<= n ; i++ ){
	        str+=i;
	    }
	    System.out.print("Enter size or k : ");
	    int k = sc.nextInt();
	    list = new ArrayList<>();
	    kSizeListOfNumber(str,0,"",k);
	    System.out.println(list);
	    
	}
}
