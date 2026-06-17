import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class DublicateNum {
    // public static void  Dublicatefind(int n,int[] arr){
       
    //     ArrayList<Integer> duplicate = new ArrayList<>();
    //         for(int i = 0; i < n; i++){
    //             for(int j = i + 1; j < n; j++){
    //                 if(arr[i] == arr[j]){
    //                     duplicate.add(arr[i]);
    //                 }
    //             }
    //         }
    //         System.out.println(duplicate);
    // }

   

    // public static void HashMapDublicate(int n,int[] arr){
    //     HashMap<Integer,Integer> map=new HashMap<>();
    //     for(int i=0;i<n;i++){
    //         if(map.containsKey(arr[i])){
    //             map.put(arr[i],map.get(arr[i])+1);
    //         }else{
    //             map.put(arr[i],1);
    //         }
    //     }
    //     for(Map.Entry<Integer,Integer> entry:map.entrySet()){
    //         if(entry.getValue()>1){
    //             System.out.println("Dublicate num is  HashMap"+entry.getKey());
    //         }
    //     }
    // }
    
    public static void Dublicatefind(int n,int[] arr){
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] == arr[j]){
                    count++;
                    System.out.println("Dublicate num is "+arr[i]);
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();
         
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            System.out.print("Enter num  ");
            arr[i]=sc.nextInt();
        }
        //display arry
        for(int i:arr){
            System.out.println(i);
        }
        //using brute force method to find duplicate numbers
        Dublicatefind(n,arr);
        //using HashMap to find duplicate numbers
       // HashMapDublicate(n,arr);
       
    }
    
}
