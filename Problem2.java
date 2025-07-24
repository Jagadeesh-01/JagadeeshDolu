
public class Problem2 {
    public static void main(String[] args) {
        int a = 5;
        for (int i = 0; i < a; i++) {
            System.out.print((2 * i + 1) + (i < a - 1 ? ", " : ""));
        }
    }
}
