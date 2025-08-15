# Day10 : You are given an integer array prices where prices[i] represents the price of a given stock on the i-th day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If no profit is possible, return -1.

**Testcases:**
1. Input: 7 1 5 3 6 4     output: 4
2. Input: 7 6 4 3 1       output:-1

**Intuition**
1. We can solve this problem efficiently in one pass by keeping track of:
   minPrice — the lowest price seen so far
   maxProfit — the best profit we could have made if selling today
2. For each price:
   Update minPrice if today’s price is lower.
   Calculate today’s profit = price - minPrice.
3. Update maxProfit using Math.max(maxProfit, profit).

**Algorithm Flow**
1. Read the input size n and prices array.
2. Initialize:
   minPrice = first element of prices.
   maxProfit = 0.
3  Loop through each price from the second day onwards:
    If current price < minPrice, update minPrice.
    Else, calculate profit = price - minPrice.
4  Update maxProfit = Math.max(maxProfit, profit).
5  If maxProfit > 0, print it; otherwise print -1.

**Complexity Analysis**
Time Complexity: O(n) — single pass through the prices array.
Space Complexity: O(1) — only two variables are used.
