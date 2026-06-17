import java.util.Scanner;
public class add{
    public static int add(int a, int b){
        return a+b;
    }
    public static String name(){
        String name = "Neelamohan";
        return name;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter two number : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = add(num1,num2);
        System.out.println("Sum is : " + sum);
        System.out.println(name());

    }
}