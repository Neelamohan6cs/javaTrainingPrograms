import java.util.Scanner;
public class narray{
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

        for(int i =0;i<r;i++){
            for(int j= 0;j<c;j++){
                System.out.print(arr[i][j]+ " ");
            }
        System.out.println();
        }
        System.out.println("Diagonal element is : ");
          for(int i =0;i<r;i++){
            
            for(int j= 0;j<c;j++){
                if(i==j){
                    System.out.print(arr[i][j] + " ");
                }   
            }

        }
        
/*
        int rowsum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                rowsum +=arr[i][j];
            }
            System.out.println(i+1 + " sum is" + rowsum);
            rowsum=0;

        } System.out.prin
        */
        
    }

}