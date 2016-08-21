package practice;

public class IsPerfectNumber {
 
   
     
    public static void main(String a[]){
        IsPerfectNumber ipn = new IsPerfectNumber();
        for(int i=1;i<5000;i++){
        	boolean out=ipn.isPerfectNumber(i);
        	if(out)
        System.out.println(i+"Is perfect number: "+ipn.isPerfectNumber(i));
        }
    }
    public boolean isPerfectNumber(int number){
        
        int temp = 0;
        for(int i=1;i<=number/2;i++){
            if(number%i == 0){
                temp += i;
            }
        }
        if(temp == number){
            //System.out.println("It is a perfect number");
            return true;
        } else {
            //System.out.println("It is not a perfect number");
            return false;
        }
    }
}
