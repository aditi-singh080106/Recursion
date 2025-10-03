import java.util.Scanner;
public class Main
{
    public static void mango(){
        System.out.println("Hi.., I'm in mango");           // 4
    }
    public static void banana(){
        System.out.println("Hi.., I'm in banana");          // 3
        mango();
    }
    public static void apple(){
        System.out.println("Hi.., I'm in apple");           // 2
        banana();
    }
	public static void main(String[] args) {
	    System.out.println("Hi.., I'm in the main method"); // 1
	    apple();
	}
}
