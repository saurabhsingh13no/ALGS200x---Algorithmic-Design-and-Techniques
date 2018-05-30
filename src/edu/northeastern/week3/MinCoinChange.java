package edu.northeastern.week3;

import java.util.*;

public class MinCoinChange {

    public static void main(String[] args) {
        System.out.println("Enter no. of available coins : ");
        Scanner scanner =  new Scanner(System.in);
        int ncoins = scanner.nextInt();  // Asking - how many coins are there for giving change
        List<Integer> coins = new ArrayList<Integer>();

        System.out.println("Enter "+ncoins+" coins seperated by space : ");
        for (int i=0;i<ncoins;i++) {
            coins.add(scanner.nextInt());
        }

        Collections.sort(coins, Collections.reverseOrder());

        System.out.println("Enter amount for which change is desired : ");
        int change = scanner.nextInt();

        System.out.println("Total change coins provided : "+getMinCoins(coins, change));

    }

    private static int getMinCoins(List<Integer> coins, int change) {
        int minCoins = 0;
        int quotient;


        for (int coin: coins) {

            quotient = change/coin;
//            System.out.println(coin+ " " +quotient);
            minCoins += quotient;
            change -= quotient*coin;
        }

        return minCoins;
    }
}
