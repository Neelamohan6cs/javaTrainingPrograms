// // 1. Reverse a String

// // Input:

// // hello

// // Output:

// // olleh

// class Main{
//     public static void main(String[] args){
//         String name="hello";
//         String rev="";
//         for(int i =name.length()-1;i>=0;i--){
//             char c=name.charAt(i);
//             rev +=c;
//             System.out.println(c);
//         }
//         System.out.println(rev);
//     }
// }

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("ent nm to chaecl");
        int n =sc.nextInt();
        int count =0;
        for(int i =1;i<=n;i++){
            if(n%i==0){
                count =count +1;
            }
        }
        if(count<=2){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not Prime");
            
        }
    }
}

