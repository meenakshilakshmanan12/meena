import java.util.Scanner;
import java.util.StringTokenizer;

class NinthTask{
	public static void main(String[] args){
		Scanner scan = new Scanner(System. in);
	    System.out.println("enter the string:");
		String s = scan.nextLine();
		System.out.println("Before Tokenizing:");
		System.out.println(s);
		String[] result = s.split("\\s");          //converts the string into tokens with whitespace as delimiter
		System.out.println("After Tokenizing:");
		for (int x=0; x<result.length; x++)
           System.out.println(result[x]);
	    System.out.println("After Tokenizing with the class StringTokenizer:");
	    StringTokenizer st = new StringTokenizer(s);           //converts the string into tokens with whitespace as delimiter
        while (st.hasMoreTokens()) {
         System.out.println(st.nextToken());
        }
		System.out.println("After Tokenizing with the class StringTokenizer with a delimiter:");
		StringTokenizer st1 = new StringTokenizer(s, ".");       //converts the string into tokens with given string as delimiter
        while (st1.hasMoreTokens()) {
         System.out.println(st1.nextToken());
        }
	}
}