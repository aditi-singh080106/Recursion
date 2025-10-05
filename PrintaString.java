import java.util.Scanner;
public class Main
{
    public static void printString(String str ,int i){
        if(i==str.length()) return;
        System.out.print(str.charAt(i));
        printString(str,i+1);
    }
    public static void print(int[] arr ,int idx , int n){
        if(idx==n) return;
        System.out.print(arr[idx]+"\t");
        print(arr,idx+1,n);
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int[] arr = {1,2,3,4,5,6,7,8,9,10};
	    print(arr,0,arr.length);
	    System.out.println();
	    String s="Jeon Jungkook";
	    printString(s,0);
	}
}
