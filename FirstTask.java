public class FirstTask{ 



    public static String concatWithStr()    {  
        String t = "Meenakshi"; 
        for(int i=0;i<5000;i++){		
           t = t + "Lakshmanan";   
        }
		return t;  
    }  
    public static String concatWithStrBuf(){  
        StringBuffer sb = new StringBuffer("Meenakshi");
		for(int i=0;i<5000;i++){
        sb.append("Lakshmanan");
		}		
        return sb.toString();  
    }   
    public static void main(String args[]){ 
        //test for time taken
	    long startTime = System.currentTimeMillis();  
        concatWithStr();  
        System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime)+"ms"); //takes some time 
        startTime = System.currentTimeMillis();  
        concatWithStrBuf();  
        System.out.println("Time taken by Concating with  StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms"); //concats within no time
		
        //hashcode test  
        String str="Meenakshi";  
        System.out.println(str.hashCode());  // generates the hashCode of str
        str=str+"Lakshmanan";  
        System.out.println(str.hashCode());  //provides new hashCode for str
   
        
        StringBuffer sb=new StringBuffer("Meenakshi");  
        System.out.println(sb.hashCode());  //generates the hashCode of str
        sb.append("Lakshmanan");  
        System.out.println(sb.hashCode());  //gives the same hashCode as before
    }  
}  