public class HarmonicNumber {
    public static void main(String[] args) {
        args = new String[3];
        args[0] = "10";
        int n = Integer.parseInt(args[0]);
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum = sum + 1.0 / i;
        }
        System.out.println(sum);
    }
}
