package practice;

public class Zigzag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iny[]={25,-2,13,-5,-8,4,8,-3,19,20};
		int[] hgf=wiggleArrangeArray(iny);	
		for(int i=0;i<hgf.length;i++){
			System.out.println(hgf[i]);
		}
			
	}
	static int[] wiggleArrangeArray(int[] intArr) {
	 int i,j;
	 int l=intArr.length;
	 int[] n=intArr;
	 int[] k=intArr;
	 int[] asc=new int[l];
	 int[] dsc=new int[l];
	 int[] out=new int[l];
	 
for(i=0;i<l;i++){
	for(j=0;j<l-1;j++){
		if(n[j]<n[j+1]){
			int o=n[j];
			n[j]=n[j+1];
			n[j+1]=o;
		}
	}
}
asc=n;

//for(i=0;i<l;i++){
//	for(j=0;j<l-1;j++){
//		if(k[j]<k[j+1]){
//			int o=k[j];
//			k[j]=k[j+1];
//			k[j+1]=o;
//		}
//	}
//}
//dsc=k;
boolean b=false;
int t=1;
int v=0;
for(i=0;i<l;i++){
	b=!b;
	if(b){
		out[i]=asc[v];
		//System.out.println(v+" "+asc[v]+" "+i);
		v++;
	}
	if(!b){
		out[i]=asc[l-t];
		//System.out.println(t+" "+asc[l-t]+" "+i);
		t++;
		
	}
	
}
	 
return out;
}
}
