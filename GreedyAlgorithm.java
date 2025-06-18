import java.util.Arrays;
class GreedyAlgorithm {
    public static void main(String[] args) {
        int[] coins = {1, 5, 10, 25};
        int amount = 49;
        findMinimumCoins(coins, amount);
    }
    public static void findMinimumCoins(int[] coins, int amount) {
        Arrays.sort(coins);
        int coinCount = 0;
        System.out.print("Coins used: ");
        for (int i = coins.length - 1; i >= 0; i--) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                System.out.print(coins[i] + " ");
                coinCount++;
            }
        }
        System.out.println("\nTotal coins used: " + coinCount);
    }
}