public class ConcatTest{  
    public static String concatWithString()    {  
        String str = "Meena";  
        for (int i=0; i<100; i++){  
            str = str + "Lakshmanan";  
        }  
        return str;  
    }  
    public static String concatWithStringBuffer(){  
        StringBuffer sb = new StringBuffer("Meena");  
        for (int i=0; i<100; i++){  
            sb.append("Lakshmanan");  
        }  
        return sb.toString();  
    }  
    public static void main(String[] args){  
        long startTime = System.currentTimeMillis();  
        concatWithString();  
        System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime)+"ms");  
        startTime = System.currentTimeMillis();  
        concatWithStringBuffer();  
        System.out.println("Time taken by Concating with  StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");  
    }  
}  