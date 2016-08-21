package practice;

import java.util.Scanner;

public class NonRepeatChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string to find first non repetative char: ");
	      Scanner s=new Scanner(System.in);
	      String str=s.next();
	      NonRepeatChar n=new NonRepeatChar();
      String c=n.findNonRepeat(str);
       System.out.println("The first Non repeat char is: "+c);
       
	}
 public  String findNonRepeat(String str){
	 
	 int i,j;
	 boolean b=false;
	 int length=str.length();
	 String[] sr=str.split("");
	 for(i=0;i<length;i++){
		 for(j=i+1;j<length;j++){
			 if(j==length){System.out.println("NO repeate");
			 }
			 else if(sr[i].equals(sr[j])){
				b=true;
				break;
			}
			
		 }
		 if(b==true){break;}
		 	 }
	if(b==true)
	{
		return sr[i];
	}else{ return "No repeated char";}
 }
 
}
