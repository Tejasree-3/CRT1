import java.util.Scanner;
public class Tribonacci {
    public static int tribonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            int t0 = 0;
            int t1 = 1;
            int t2 = 1;
            int result = 0;
            for (int i = 3; i <= n; i++) {
                result = t0 + t1 + t2;
                t0 = t1;
                t1 = t2;
                t2 = result;
            }
            return result;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int result = tribonacci(n);
        System.out.println("The " + n + "th Tribonacci number is: " + result);
        scanner.close();
    }
}