import java.util.*;

public class library{
    public  static void main(String args[]){
         
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num<=5){
            System.out.println("fine amount for less than equal 5 days"+num*2);
        }
        else if(num>=10){
            System.out.println("fine amount for less than equal 10 days"+num*5);
        }
        else if(num>=15){
            System.out.println("fine amount for less than equal 15 days"+num*10);
        }
        
    }
}
