package practice;

public class New {
	public static void main(String args[]){
		String name="Sunil N Paidi";
		int index1=name.indexOf(" ");
		System.out.println("First name:"+name.substring(0,index1));
		int index2=name.indexOf(" ",index1+1);
		System.out.println("Middle Name:"+name.substring(index1+1,index2));
		System.out.println("Last Name:"+name.substring(index2+1));
	}
	

}
