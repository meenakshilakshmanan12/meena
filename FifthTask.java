import java.util.Arrays;
import java.util.Scanner;

public class FifthTask{
    public static void main(String[] args) throws Exception{
        // args is the list of guests
		System.out.print("no. of strings to be sorted:");
		Scanner s = new Scanner(System. in);
		int n = Integer.parseInt(s.nextLine());
		String arrayOfNames[] = new String[n];
		System.out.println("strings to be sorted:");
		for(int i=0;i<arrayOfNames.length;i++)
            arrayOfNames[i] = s.nextLine();
		System.out.println("strings typed in:");
		for(int i=0;i<arrayOfNames.length;i++)
			System.out.println(arrayOfNames[i]);
		Arrays.sort(arrayOfNames);
		System.out.println("strings after being sorted:");
        for(int i = 0; i < arrayOfNames.length; i++)
            System.out.println(arrayOfNames[i]);
    }
}