import java.util.Scanner;
class Main {
    public static void printBinaryString(String s , int a1, int n){
        if(s.length()==n){
            System.out.println(s);
            return;
        }
        s+=a1;
        if(s.charAt(s.length()-1) == '1') printBinaryString(s,0,n);
        else{
            printBinaryString(s,0,n);
            printBinaryString(s,1,n);
        }
    }
    public static void printBinary(String s, int n){
        if(s.length()==n){
            System.out.println(s);
            return;
        }
        if(s.length()==0||s.charAt(s.length()-1)=='0'){
            printBinary(s+1,n);
            printBinary(s+0,n);
        }
        else printBinary(s+0,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value : ");
        int n = sc.nextInt();
        printBinaryString("",0,n);
        printBinary("",n);
    }
}
