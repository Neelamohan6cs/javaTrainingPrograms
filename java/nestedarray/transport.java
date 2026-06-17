import java.util.Scanner;
public class transport{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Row size :  ");
        int r =sc.nextInt();
        System.out.println();
        System.out.print("Enter col size :  ");
        int c =sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i =0;i<r;i++){
            for(int j= 0;j<c;j++){
                System.out.print("Enter Elemnet ");
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++){
            for(int j = 0;j<c;j++){
                int temp =arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        System.out.println("Transpose of the matrix is : ");
        for(int i =0;i<r;i++){
            for(int j= 0;j<c;j++){
                System.out.print(arr[i][j]+ " ");
            }
        System.out.println();
        }
        

        
    }

}