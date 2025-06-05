function maxProfit(prices: number[]): number {
    let sellTwo = 0;
    let holdTwo = - Infinity;
    let sellOne = 0;
    let holdOne = -Infinity;

    for (let i = 0; i < prices.length; i++) {
        const price = prices[i];

        sellTwo = Math.max(sellTwo, holdTwo + price);
        holdTwo = Math.max(holdTwo, sellOne - price);
        sellOne = Math.max(sellOne, holdOne + price);
        holdOne = Math.max(holdOne, -price);
    }
    return sellTwo;
};