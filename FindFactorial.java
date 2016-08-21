package practice;

public class FindFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FindFactorial f=new FindFactorial();
for(int i=1;i<10;i++){
int y=f.factorial(i);
System.out.println(y);
}
	}
public int factorial(int in){
	int out=1;
	for(int i=in;i>0;i--){
		out*=i;
	}
	return out;
}
}
