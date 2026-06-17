import java.util.Scanner;
public class fact{
    public static void main(String[] args){
        
        Scanner sc =new Scanner(System.in);
        System.out.println("entyer number = ");
        int n =sc.nextInt();
        int temp = n;
        int factsum=0;
        
        while(n>0){
            int digit = n % 10 ;
            int fact = 1;
            for(int i =1; i<=digit;i++){
                fact = fact*i;

            }
            factsum=factsum+fact;
            n = n/10;
            fact=1;
            
        }
        if (temp==factsum){
            System.out.println("Strong num");

        }else{
            System.out.println("its not");
        }
        
        
    }

        
}
      
