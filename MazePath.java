import java.util.Scanner;
public class Main
{
    public static int maze(int row, int col , int rsize , int csize){
        if(row==rsize||col==csize) return 1;
        int rightways=maze(row,col+1,rsize,csize);
        int downways=maze(row+1,col,rsize,csize);
        return rightways+downways;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter rows : ");
	    int n=sc.nextInt();
	    System.out.print("Enter columns : ");
	    int m=sc.nextInt();
	    System.out.print("Total number of ways : "+maze(1,1,n,m));
	    
	}
}
