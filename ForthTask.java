import java.util.Scanner;
public class ForthTask{
	public static void main(String args[]){
		System.out.print("Enter the string:");
		Scanner s = new Scanner(System. in);
        String str = s. next();
        System.out.println(str);
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String str1= sb.toString();
		//boolean b = str.equalsIgnoreCase(str1);
		if(str.equalsIgnoreCase(str1)==true)
		System.out.println("Entered string is a palindrome");
	}
}