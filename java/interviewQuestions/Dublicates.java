import java.util.ArrayList;
import java.util.HashSet;

public class Dublicates {
    public static void ans(int[] arr){
        ArrayList<Integer> dub=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    dub.add(arr[i]);
                }
            }
        }
        for(int i:dub){
            System.out.println(i);
        }
    }
    

    public static void HashMapDub(int[] arr){
        HashSet<Integer> seen = new HashSet<>();
         HashSet<Integer> duplicates = new HashSet<>();

            for(int num : arr){

                if(!seen.add(num)){
                    duplicates.add(num);
                }
            }

            for(int num : duplicates){
                System.out.println(num);
            }
        }

    public static void  main(String[] args){
        int [] arr={10,20,30,10,40,20};

        for (int i:arr){
            System.out.print(i+",");
        }
        ans(arr);
    }
    
}
