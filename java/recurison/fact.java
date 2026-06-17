import java.util.Scanner;
public class fact{
    int factorial(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*(n-1);
        }
    }
    public static void main(String[] args){
        
        Scanner sc =new Scanner(System.in);
        System.out.println("entyer number = ");
        int n =sc.nextInt();
        
        fact obj=new fact();
        System.out.println(obj.factorial(n));
       
    
    }      
}
      
