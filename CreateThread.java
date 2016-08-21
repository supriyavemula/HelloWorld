package practice;

public class CreateThread extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display d=new display();
		NewThread n=new NewThread(d,"I");
		NewThread n1=new NewThread(d,"Love");
		NewThread n2=new NewThread(d,"you");
		
		}
}
class NewThread extends Thread{	
	Thread t;
	display d=new display();
	public NewThread(display d,String name){
		this.d=d;
	 t=new Thread(this,name);
	 t.start();	
	}

	public void run(){
     
    	  d.out(t.getName());
       
	
}
}
class display{
	synchronized public void out(String msg){
		System.out.print("{"+msg);
		try{
	       Thread.sleep(1000);
		}catch(InterruptedException e){System.out.println(e);}
	     System.out.print("}");
	
}

}



