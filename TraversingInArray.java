import java.util.Scanner;
public class Main
{
    public static void print(int[] arr ,int idx , int n){
        if(idx==n) return;
        System.out.print(arr[idx]+"\t");
        print(arr,idx+1,n);
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int[] arr = {1,2,3,4,5,6,7,8,9,10};
	    print(arr,0,arr.length);
	}
}
