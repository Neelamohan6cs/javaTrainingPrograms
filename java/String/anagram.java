import java.util.Scanner;
public class anagram{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if(s1.length() !=  s2.length()){
            System.out.println();
            return;
        }
        int freq[]=new int [256];
        for(int i =0;i<s1.length();i++){
            char ch =s1.charAt(i);
            freq[ch]++;
        }
        for(int i =0;i<s2.length();i++){
            char ch =s2.charAt(i);
            freq[ch]--;
        }
        for(int i =0;i<256;i++){
            if(freq[i] != 0){
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("Anagram");

    }
} 
