package practice;



public class MyPrimeNumCheck {
 
    public boolean isPrimeNumber(int number){
         
        for(int i=2; i<=number/2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
     
    public static void main(String a[]){
        MyPrimeNumCheck mpc = new MyPrimeNumCheck();
        for(int i=0;i<100;i++){
        	boolean b=mpc.isPrimeNumber(i);
        	if(b)
        System.out.println("Is"+ i+" prime number? "+b);
      }
    }
}
