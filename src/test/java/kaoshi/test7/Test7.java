package kaoshi.test7;
import java.util.Scanner;
public class Test7 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("����һ������:");
	String s=sc.nextLine();
	Store f=new Store();
	Animal a=f.getInstance(s);
	a.voice();
}
}
