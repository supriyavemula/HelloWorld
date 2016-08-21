package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] inp={2,2,2,3,3};
		FindDup f=new FindDup();
		String outt=f.Duplicate(inp);
		System.out.println("Duplicates are:"+ outt);
		
		
		
	}
public String Duplicate(int[] in){
	StringBuffer st=new StringBuffer();
	int[] num=in;
	//System.out.println(num);
	int l=num.length;
	int[] dup = new int[l];
	int y=0;
	
	Map<Integer,Integer> out=new HashMap<Integer,Integer>();
	for (int i=0;i<l;i++){
		Integer k=0;
		for(int j=0;j<l;j++){
			if(num[i]==num[j]){
				out.put(num[i],k++);
				
			}
			
			}
		//System.out.println(out);
	}
	System.out.println(out);
	Set<Integer> keys=out.keySet();
	int[] k=new int[l];
	for(int i:keys){
		//System.out.println(i);
		k[i]=out.get(i);
		//System.out.println(k[i]);
		//System.out.println(k[i]);
		if(k[i]>0){
			dup[y]=i;
			st.append(dup[y]+" ");
			//System.out.println(dup[y]);
			y++;
		}
	}
	return st.toString();
	
	}
	
	

}

