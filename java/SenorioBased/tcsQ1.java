import java.util.Scanner;

public class tcsQ1{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String input= sc.nextLine();
        int count=0;
        int result=0;

        for(int i =0;i<input.length();i++){
            char current=input.charAt(i);
            if((int)current == (int)' '){
                if (count>result){
                    result=count;
                    count=0;
                }
                count=0;
            }
            else{
                count++;
            }
        }
        
        System.out.print(result);
    }
}