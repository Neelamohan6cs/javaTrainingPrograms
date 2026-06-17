import java.util.Scanner;

class TwoArray{
 public static void main(String[] args){
	    System.out.println("enter size of 2 d arr size");
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n);
		int arr[][]=new int[n][n];
		for (int i=0;i<n;i++){
			for (int j=0;j<n;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i=0;i<n;i++){
			for (int j=0;j<n;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for (int i=0;i<n;i++){
			for (int j=0;j<n;j++){
				arr[i][j]=arr[i][j]%2;
			}
			System.out.println();
		}
		for (int i=0;i<n;i++){
			for (int j=0;j<n;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}



		
		 
	}
}