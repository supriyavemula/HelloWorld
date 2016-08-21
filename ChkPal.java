package practice;

import java.io.InputStream;
import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class ChkPal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChkPal c=new ChkPal();
		boolean b=c.IsPalindrome("dececed");
		System.out.println("dececed is Palindrome?"+b);
		String s=c.FNC("reverse");
		System.out.println("The non repeate cahr is:"+s);
		
	}
public boolean IsPalindrome(String str){
	boolean retn=false;
	
	String words[]=str.split("");
	int l=words.length;
	int c=l-1;
	for(int i=0;i<l;i++){
		if(words[i].equals(words[c])){
			//System.out.println(words[i]+words[c]);
			retn=true;
			c--;
		}else{retn=false;
		break;}
	}
	return retn;
}
public String FNC(String str){
	String retn="";
	boolean b=false;
	String words[]=str.split("");
	int l=words.length;
	Integer o;
	Map<String,Integer> find=new HashMap<String,Integer>();
	int c=l-1;
	for(int j=0;j<=c;j++){
		if(j==l)break;
		else{
	for(int i=j+1;i<l;i++){
		if(words[j].equals(words[i])){
			System.out.println(words[j]+words[i]);
			b=false;
			break;}
		else{
			b=true;
			continue;			
		}
	}
		if(b==true){
			 retn=words[j];
			break;
		}
		
	
	}
	}
	if(b==false){return retn="NoNonRepeate";}
	else return retn;
	
	
}
	

}
