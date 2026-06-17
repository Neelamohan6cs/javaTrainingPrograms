import java.util.Scanner;
public class pn{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        if (num >0){
            System.out.println("Positive");
        }else if(num <0){
            System.out.println("Nagative");
        }
        else{
            System.out.println("Zero");
        }
    }
}