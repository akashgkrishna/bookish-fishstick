package learn.loops;

//    1
//   123
//  12345
// 1234567

public class D4 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < 2 * i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
