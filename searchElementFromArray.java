import java.util.Scanner;
public class Main
{
    // Print index of a given element in an array. If not present, print -1.
    public static void searchElement(int[] arr , int ele , int idx){
        if(idx<arr.length && arr[idx]==ele){
            System.out.println(idx);
            return;
        }
        if(idx== arr.length){
            System.out.print("-1");
            return;
        }
        searchElement(arr,ele,idx+1);
    }
   
	public static void main(String[] args) {
	    int[] arr = {1,2,3,4,5,6,7,8,9,10};
	    searchElement(arr,18,0);
	}
}
