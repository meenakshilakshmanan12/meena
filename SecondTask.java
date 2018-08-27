public class SecondTask{
    public static void main(String args[]){
       String a="Meenakshi";
       String b=a;                     //copying directly and "meenakshi" is stored in both a & b
	   String c="Lakshmanan";
       String d=new String(c);         //copying by creating object of String class that returns the value of the string in the argument passed
	   System.out.println(a+" "+c);    
	 System.out.println(b+" "+d);
	}  
}