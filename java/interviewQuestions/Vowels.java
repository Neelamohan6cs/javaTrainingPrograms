public class Vowels {
    public static void main(String[] args) {

        String[][] para = {
                {"String1", "iam"},
                {"String2", "comedian"}
        };

        int count = 0;
        int sum =0;
        int max = 0;
        String ans ="";

        for (int i = 0; i < para.length; i++) {
            for (int j = 0; j < para[i].length; j++) {

                String current = para[i][j];
                sum += current.length();
                if(current.length()>max){
                    max=current.length();
                    ans=para[i][j];
                }
                for (int k = 0; k < current.length(); k++) {
                    char ch = current.charAt(k);
                    if (ch == 'a' || ch == 'e' || ch == 'i' ||
                        ch == 'o' || ch == 'u') {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
        System.out.println(sum);
        System.out.println(ans);
    }
}