package practice;

public class prac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int i[]={1,10,2,3,10,2,5,7,8,10};
  int search=10;
  int Count = 0;
  int a;
  for(a=1;a<i.length;a++){
	  if(i[a]==search){
		  Count++;
	  }
	
  }
  System.out.println(Count); 
  for(a=1;a<i.length;a++){
	  if(i[a]==search){
		  System.out.println("word found");
		 break;
	  }
	  
  }
	}

}
