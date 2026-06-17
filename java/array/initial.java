import java.util.Scanner;
public class initial{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Size :  ");
        int n =sc.nextInt();
      
        int arr[]=new int[n];
        for(int i =0;i<n;i++){
            System.out.print("Enter Elemnet ");
            System.out.print(i+1);
            arr[i]=sc.nextInt();
        }
        for(int j = 0;j<n;j++){
            System.out.println(arr[j]);
        }
    }

}