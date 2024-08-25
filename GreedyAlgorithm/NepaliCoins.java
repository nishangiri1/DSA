package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class NepaliCoins {
    public static int nepaliCoins(int coins[], int amount) {
        Arrays.sort(coins);
        int num = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = coins.length - 1; i >= 0; i--) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    ans.add(coins[i]);
                    num++;
                    amount -= coins[i];
                }
            }
        }
        for (Integer integer : ans) {
            System.out.print(integer + " ");
        }
        System.out.println();
        return num;
    }

    public static void main(String[] args) {
        int coins[] = { 2, 1, 5, 10, 50, 20, 500, 100, 1000 };
        int amount = 1240;
        System.out.println(nepaliCoins(coins, amount));
    }
}
