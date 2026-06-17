import java.util.Scanner;
public class demo{
    void print(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        print(n-1);
    }
    public static void main(String[] args){ 
        Scanner sc =new Scanner(System.in);
        System.out.println("entyer number = ");
        int n =sc.nextInt();
        
        demo obj=new demo();
        obj.print(n);
       
    
    }      
}
      
