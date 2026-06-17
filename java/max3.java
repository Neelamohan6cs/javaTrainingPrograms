import java.util.Scanner;
public class max3{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        String reverse = "";
        while(num>0){
            int digit=num%10;
            reverse = (String)(reverse+digit);
            num =num/10;
        }
        System.out.println(Integer.parseInt(reverse));
    }
}