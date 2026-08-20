import java.util.*;

public class Banktran {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] transaction = new int[n];

        HashMap<Integer, Integer> datas = new HashMap<>();

        System.out.println("Enter transaction:");

        // Read transactions
        for (int i = 0; i < n; i++) {
            transaction[i] = sc.nextInt();
        }

        // Count frequency
        for (int i = 0; i < n; i++) {

            if (datas.containsKey(transaction[i])) {

                int current_value = datas.get(transaction[i]);

                datas.put(transaction[i], current_value + 1);

            } else {

                datas.put(transaction[i], 1);
            }
        }

        // Print transaction and its frequency
        System.out.println("Output");
        for (Map.Entry<Integer, Integer> entry : datas.entrySet()) {

                if (entry.getValue() >= 2) {
                    System.out.print(entry.getKey() +" ");
                }

        }

        sc.close();
    }
}