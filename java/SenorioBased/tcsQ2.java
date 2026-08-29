public class tcsQ2 {
    public static void main(String[] args) {
        String input="aaabaaaaccccddaff";//10 excpted output
        int count= 1;
        int result= 0;
        for(int i=1;i<input.length();i++){
            char previous=input.charAt(i-1);
            char current=input.charAt(i);
            if((int)previous==(int)current){
                count++;
            }
            else{
                if(count%2==0){
                    result=result+count;
                }
                count=1;
            }
        }
        System.out.println(result);
        
    }
}
