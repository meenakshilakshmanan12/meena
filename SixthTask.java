import java.util.Scanner;
import java.util.HashMap;

public class CharOccuranceInString {
	public static void main(String[] args) {
		//String s= "java";
		Scanner scan = new Scanner(System. in);
	    System.out.println("enter the string:");
		String s = scan.nextLine();
		HashMap<String, Integer> counter = new HashMap();
		for(char c : s.toCharArray()){
			String str = c+"";
			if(!counter.containsKey(str)){
				counter.put(str, 1);
			}else{
				counter.put(str, counter.get(str)+1);
			}
		}
		System.out.println(counter);
	}
}
