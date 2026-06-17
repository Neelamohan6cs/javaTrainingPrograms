import java.util.Scanner;
public class sumDigit{
    int sum(int n){
        if(n==0){
            return 0;65 
        }
        else{
           return 1 + sum(n/10);
        }
    }

    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        System.out.println("entyer number = ");
        int n =sc.nextInt();
        
        sumDigit obj=new sumDigit();
        System.out.println(obj.sum(n));   
    }      
}
