/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one 
stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
*/

public int maxProfit(int[] prices) {
        int max=0,buy=Integer.MAX_VALUE;
        for(int price:prices){
            if(price<buy){
                buy=price;
            }
            max=Math.max(max, price-buy);
        }


            return max;
        
    }