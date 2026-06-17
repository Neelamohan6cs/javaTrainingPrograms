import java.util.Scanner;
public class frq{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size :  ");
        int n =sc.nextInt();
      
        int arr[]=new int[n];
        for(int i =0;i<n;i++){
            System.out.print("Enter Elemnet ");
            System.out.print(i+1);
            arr[i]=sc.nextInt();
        }
        int frq[]=new int[256];
        for(int i =0;i<n; i++){
            frq[arr[i]]++;
        }
        for(int i = 0;i<256;i++){
            if(frq[i]>0)
            System.out.println(i+""+frq[i]+"occures");
        }

    }

}