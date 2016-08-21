package practice;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int in[]={1,2,4,10,12,5,20,17};
//int iny[]={25,-2,13,-5,-8,4,8,-2,19,20};
int[] out=inSort(in);
for(int i=0;i<in.length;i++){
	System.out.println(out[i]);
}

//closestNumbers(iny);
//lonelyInteger(iny);
	}
public static int[] inSort(int[] input){
	int[] in=input;
	int l=in.length;
	int y=0;
	int x=0;
	//System.out.println(l);
	for(int j=0;j<l;j++){
		
		for(int i=0;i<l-1;i++){
			if(in[i]>in[i+1]){
				y=in[i];
				in[i]=in[i+1];
				in[i+1]=y;
			}
		}
	}return in;
		
	
	
}





}
