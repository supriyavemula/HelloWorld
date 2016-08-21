package practice;

public class MaxNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] in={10,20,30,2,5,35,21,38};
MaxNumArray m=new MaxNumArray();
int out=m.findMax(in);
System.out.println(out);
	}
public int findMax(int[] in){
	int l=in.length;
	int out=0;
	for(int i=0;i<l;i++){
		if(out<in[i]){
			out=in[i];
		}
	}
return out;}
}
