import java.util.Scanner;
public class eo{
    int reverse(int a){
        int num=a;
        int rev =0;
        while(num>0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        return rev;
            
    }
    String reverse(String name){
        String rev="";
        for(int i=name.length()-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }
        return rev;    
    }
      
    public static void  main(String[] args){
        eo S1=new eo();
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter  number  : ");
        int num = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter name  : ");
        String name = sc.nextLine();

        int result = S1.reverse(num);
        String result1 = S1.reverse(name);    
        System.out.println();


        System.out.println("Reversed number: " + result);
        System.out.println("Reversed name: " + result1);
    }
}

