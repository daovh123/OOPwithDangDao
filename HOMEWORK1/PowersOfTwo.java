public class PowersOfTwo {
    public static void main(String[] args) {
        args = new String[3];
        args[0] = "4";
        int n = Integer.parseInt(args[0]);
        int i = 0;
        int poweroftwo = 1;

        while (i <= n) {
            System.out.println(i + " " + poweroftwo);
            poweroftwo *= 2;
            i = i + 1;
        }
    }
}
