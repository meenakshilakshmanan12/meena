public class ThirdTask{  
    
    public static void main(String[] args){  
	  String str = "Meena";  
      str = str + "Lakshmanan";             //with the concate operator '+'  
	  StringBuilder sb = new StringBuilder("Meena");
	  sb.append("Lakshmanan");              //using the method 'append' of StringBuilder
	  StringBuffer sb1 = new StringBuffer("Meena");  
      sb1.append("Lakshmanan");              //using the method 'append' of StringBuffer
      System.out.println(str);
	  System.out.println(sb);
	  System.out.println(sb1);
	}
       	   
}  