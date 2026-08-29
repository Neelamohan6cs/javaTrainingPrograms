import java.util.*;
public class detection {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num  :  ");
        int n = sc.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i =0;i<n;i++){
            System.out.print("id   ");

            int id=sc.nextInt();

            System.out.print("amount  "  );
            int amount=sc.nextInt();
            if(map.containsKey(id)){
                int current=map.get(id);
                int newinput=current+amount;
                map.put(id,newinput);
            }else{
                map.put(id,amount);
            }
        }
        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
             int id=entry.getKey();
             int amount=entry.getValue();
             if(amount>=50000){
                System.out.println(id+" "+amount);
             }

        }

       
        
    }
}