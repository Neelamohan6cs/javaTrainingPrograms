import java.util.Scanner;
public class oddeven{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        for (int j =0 ;j<n;j++){
            System.out.print("Enter the element : ");
            arr[j]=sc.nextInt();
        }
        for (int i = 1;i<n;i++){
            if(arr[i-1]<arr[i]){
               System.out.print(arr[i]+" ");  
            }
        }
    }
}
//5 3 8 6 10 7