package practice;

public class InputArray {
	
		public  static void main(String[] args){
			
			InputArray n= new InputArray();
			int[] in={1,10,23,4,6,19,20};
			int y[]=n.sortedArray(in);
			for(int i=0;i<in.length;i++){
			System.out.println(y[i]);}
		}
		
		
		
		public int[] sortedArray(int[] in)
		{
			int l=in.length;
		    int y=0;

		for(int t=0;t<l;t++){
		for(int i=0;i<l-1;i++){
		if(in[i]>in[i+1]){
			//System.out.println(y+ in[i]);
		int x=in[i];
		in[i]=in[i+1];
		in[i+1]=x;
		}
		

		}
		}
		return in;
		}
}
