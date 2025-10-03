import java.util.Scanner;
public class Main
{
    public static void mango(){
        System.out.println("Hi.., I'm in mango");           // 2 //5
    }
    public static void banana(){
        mango();
        System.out.println("Hi.., I'm in banana");          // 3
    }
    public static void apple(){
        banana();
        System.out.println("Hi.., I'm in apple");           // 4
        mango();
    }
	public static void main(String[] args) {
	    System.out.println("Hi.., I'm in the main method"); // 1
	    apple();
	}
}
