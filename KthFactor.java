
import java.util.*;

class KthFactor {

    public static int kthFactor(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
                if (n / i != i) {
                    list.add(n / i);
                }
            }
        }
        if (list.size() < k) {
            return -1;
        }
        Collections.sort(list);
        return list.get(k - 1);
    }

    public static void main(String[] args) {
        int n = 12, k = 3;
        int res = kthFactor(n, k);
        System.out.println(res);
    }
}
