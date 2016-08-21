package practice;

public class LonelyNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iny[]={1,2,3,2,1,5,3};
		int hgf=lonelyInteger(iny);	
	//System.out.println(hgf);
	}
	
	static int lonelyInteger(int[] arr) {
		int out=0;
		int i,j;
		int n=0;
		int l=arr.length;
		for(i=0;i<l;i++){
			for(j=0;j<l;j++){
				n=0;
				if(i==j)continue;
				if(arr[i]==arr[j]){
 				   n=n+1;
 				  //System.out.println(n+" "+arr[i]+" "+arr[j]);
					break;
				}
			}if(n==0){
				out=arr[i];
				System.out.println(out);
			}
		}
return out;
		}
}

