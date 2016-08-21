package practice;

public class FindSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Sunil N Paidi";
		int index1=name.indexOf(" ");
		int i=0;
		String[] str=name.split("");
	
		for(i=0;i<=index1;i++)
		{    
			
			System.out.print(str[i]);
			
		}
	}

}
