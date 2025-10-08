import java.util.Scanner;
class Main {
    public static int hcf(int a , int b){
        for(int i = Math.min(a,b); i >= 1 ; i-- ){
            if(a%i==0 && b%i==0) return i;
        }
        return 1;
    }
    public static void gcd(int dvd , int div){
        if(dvd%div==0) {
            System.out.println(div);
            return;
        }
        int rem = dvd%div;
        gcd(div,rem);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(hcf(a,b));
        gcd(a,b);
    }
}
