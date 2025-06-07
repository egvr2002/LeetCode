package Java;

public class SolutionA {
    public int maxProfit(int[] prices) {
        int finalSell = 0;
        int finalBuy = Integer.MIN_VALUE;
        int firstSell = 0;
        int firstBuy = Integer.MIN_VALUE;

        for (int quote : prices) {
            finalSell = Math.max(finalSell, finalBuy + quote);
            finalBuy = Math.max(finalBuy, firstSell - quote);
            firstSell = Math.max(firstSell, firstBuy + quote);
            firstBuy = Math.max(firstBuy, -quote);
        }

        return finalSell;
    }
}