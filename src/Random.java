public class Random {
    public static void main(String[] args) {
        long money = 1;
        int months = 36;

        for (int i = 1; i <= months; i++) {
            money = money * 2;
        }
        System.out.println(money);
    }
}
