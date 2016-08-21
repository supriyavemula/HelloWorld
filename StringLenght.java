package practice;

public class StringLenght {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String str="Supriyarani Vemula";
   int l=strLenght(str);
   System.out.println(l);
	}
public static int strLenght(String str){
	int count=0;
	String[] words = str.split("");
	for(String w: words){
		count++;
	}

	return count;
	}

}
