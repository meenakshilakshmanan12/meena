import java.util.Scanner;

public class SeventhTask{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System. in);
	    System.out.println("enter the string:");
		String s = scan.nextLine();
		System.out.println("Before removing the numbers:" + s);
		s =s.replaceAll("[0-9]","").replaceAll("java","");
		System.out.println("After removing the numbers:" + s);
	}
}
		