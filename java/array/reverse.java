import java.util.Scanner;
public class reverse{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int start =0 ;
        for(int i =(arr.length-1)/2 ;i>=0;i--){
            int temp = arr[i];
            arr[start] = temp;
            arr[i]=arr[start];
            start =start+1;
        }
        for(int j = 0 ;j < arr.length - 1 ;j++){
            System.out.println(arr[j]);
        }
    }
    
}