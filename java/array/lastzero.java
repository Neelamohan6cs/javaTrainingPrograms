import java.util.Scanner;
public class lastzero{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new   int[n];      
        for (int j =0 ;    j<n;j++){
            System.out.print("Enter the element : ");
            arr[j]=sc.nextInt();
        }
        int j = 1;
        for(int i= 0;i<n;i++){
           if(arr[i]==0){
            int temp = arr[i];
            arr[i]=arr[i+1];
            arr[n]=temp;

           }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ "->");
        }
    }
}
//5 3 8 6 10 7