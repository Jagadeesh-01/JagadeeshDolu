
public class Problem3 {
    public static void main(String[] args) {
        int a = 6;
        int limit = a % 2 == 0 ? a - 1 : a;
        for (int i = 1; i <= limit; i += 2) {
            System.out.print(i + (i < limit - 1 ? ", " : ""));
        }
    }
}
