package practice;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Test {
	static{
		try{
			Scanner in = new Scanner(System.in);
			int n=in.nextInt();
			//String s=???; Complete this line below
			String s=""+n;

		}catch(Exception e){System.out.println(e);}
	}
	
public static void main(String[] args) {
	 
	       int i=1;
	       Scanner s=new Scanner(System.in);
	       String s1=s.nextLine();
	       System.out.println(i+" "+s1);
	       if(s.hasNextLine()){
	    	   i++;
	    	   System.out.println(i+" "+s1);
	    	   
	       }
	       
	    }

}