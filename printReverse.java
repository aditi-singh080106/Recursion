import java.util.Scanner;
public class Main
{
    // Print all the elements of an array in reverse order.
    public static void printReverse(int[] arr , int idx){
        if(idx<0){
            return ;
        }
        System.out.print(arr[idx]+"\t");
        printReverse(arr,idx-1);
    }
    public static void print(int[]arr , int idx){
        if(idx==arr.length)  return;
        print(arr,idx+1);
        System.out.print(arr[idx]+"\t");
    }
	public static void main(String[] args) {
	    int[] arr = {1,2,3,4,5,6,7,8,9,10};
	    printReverse(arr,arr.length-1);
	    System.out.println();
	    print(arr,0);
	}
}
