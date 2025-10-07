import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
    static ArrayList<String> li = new ArrayList<>();
    public static void IntegerSubset(int[] a , int idx ,String ans){
        if(idx==a.length){
            li.add(ans);
            return;
        }
        IntegerSubset(a,idx+1,ans); // not included
        ans += a[idx];
        IntegerSubset(a,idx+1,ans); // included
        
    }
	public static void main(String[] args) {
	    int[] arr = {1,2,3,4,5};
	   // print it's subset
	    IntegerSubset(arr,0,"");
	    System.out.println(li);
	}
}
