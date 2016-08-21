package practice;

public class MyAmstrongNum {
 
    public static void main(String a[]){
        MyAmstrongNum man = new MyAmstrongNum();
        for(int i=10;i<1000;i++){
        	boolean b=man.isArmstrongNumber(i);
        if(b)
        System.out.println("Is"+i+" Armstrong number? "+b);
    
    }}
    
public boolean isArmstrongNumber(int number){
        
        int tmp = number;
        int noOfDigits = String.valueOf(number).length();
        int sum = 0;
        int div = 0;
        while(tmp > 0)
        {
            div = tmp % 10;
            int temp = 1;
            for(int i=0;i<noOfDigits;i++){
                temp *= div;
            }
            sum += temp;
            tmp = tmp/10;
        }
        if(number == sum) {
            return true;
        } else {
            return false;
        }
    }
    }
