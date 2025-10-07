import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
	static ArrayList<String> list ;
	public static void permutationOfString(String ans, String str) {
		if(str.length()==0) {
			list.add(ans);
			return;
		}
		for(int i = 0 ; i < str.length() ; i++ ) {
			char ch = str.charAt(i);
            String left = str.substring(0,i);
            String rigth = str.substring(i+1);
            permutationOfString(ans+ch,left+rigth);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		list = new ArrayList<>();
		System.out.print("Enter a string : ");
		String str = sc.nextLine();
		permutationOfString("",str);
		System.out.println(list);
	}
}
