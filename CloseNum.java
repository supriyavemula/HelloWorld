package practice;

public class CloseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iny[]={1,2,4,5,3,9,6,10};
		int[] hgf=closestNumbers(iny);	
		for(int i=0;i<hgf.length;i++){
			//System.out.println(hgf[i]);
		}
	}
	
	static int[] closestNumbers(int[] numbers) {
		for(int i=0;i<numbers.length;i++){
		   		   
		   for(int k=0;k<numbers.length-1;k++){
		   
		   if(numbers[k]>numbers[k+1]){
			   int o=numbers[k];
		       numbers[k]=numbers[k+1];
		       numbers[k+1]=o;
		   }
		   }
		}
		       for(int t=0;t<numbers.length-1;t++){
		           if(numbers[t+1]-numbers[t]==1){
		               System.out.println(numbers[t]+" "+numbers[t+1]);
		           }
		          
		       }
return numbers;
		   }

}
