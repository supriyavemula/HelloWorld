package practice;

import java.util.Scanner;

public class ReversePattern {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Word:");
		String input=s.next();
		String output=reverseString(input);
		System.out.println(output);
	}
 public static String reverseString(String input){
	 String in[]=input.split("");
	 StringBuffer output=new StringBuffer();
	 int length=in.length;
	 System.out.println(length);
	 int i;
	  for(i=length;i>=2;i--){
		 output.append(in[i-2]);
		 output.append(in[i-1]);
		 i--;
		 System.out.println(output.toString());
	 }
	  if(in.length%2==0){
		  return output.toString();
	  }
	  else{
		  output.append(in[0]);
	  return output.toString();
	  
		
	  }
 }
}
