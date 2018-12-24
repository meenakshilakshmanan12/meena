/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meena-pt2689
package javaapplication4;
//import java.util.Scanner;
//import Student.*;
/**
 *
 * @author meena-pt2689
 */
package pack1;
public class pack1{

		
    /**
     * @param args the command line arguments
     */
   /** public static void main(String[] args) {
                Scanner scan = new Scanner(System. in);
                System.out.println("enter the string:");
		String s = scan.nextLine();
		System.out.println("Before removing the numbers:" + s);
		s =s.replaceAll("[0-9]","@").replaceAll("java","even"); //replaces the numbers 0-9 with the character @ and the word 'java' with 'even'
		System.out.println("After removing the numbers:" + s);
	

        // TODO code application logic here
    }**/
    class Student{
        String sname;
	int sclass;
	
	public void name(String name){
		sname=name;
	}
	
	public void cls(int std){
		sclass=std;
	}
    public void printDetails(){
	  System.out.println("name:" +sname);
	  System.out.println("class:" +sclass);
	}
    }
    void m3(){
                Student s1=new Student();
		Student s2=new Student();
                s1.name("Anaamikaa");
		s1.cls(8);
		s1.printDetails();
		s2.name("Aarudhraa");
		s2.cls(7);
		s2.printDetails();
    }
    public void details(){
		pack1 p1 = new pack1();
                p1.m3();
		
	}
}
