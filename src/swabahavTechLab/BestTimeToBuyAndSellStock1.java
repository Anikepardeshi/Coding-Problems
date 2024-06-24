package swabahavTechLab;

public class BestTimeToBuyAndSellStock1 {

	public int maxProfit(int[] prices) {
		if (prices == null || prices.length == 0) {
			return 0;
		}

		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for(int price : prices) {
			if(price < minPrice) {
				minPrice = price;
			}else if(price - minPrice > maxProfit) {
				maxProfit = price - minPrice;
			}
		}
		
		return maxProfit;
	}

	public static void main(String[] args) {
		BestTimeToBuyAndSellStock1 solution = new BestTimeToBuyAndSellStock1();

		int[] prices1 = { 7, 1, 5, 3, 6, 4 };
		System.out.println("Max profit for Prices1 : " + solution.maxProfit(prices1)); //5

		int[] prices2 = { 7, 6, 4, 3, 1 };
		System.out.println("Max profit for prices2 : " + solution.maxProfit(prices2));//0
	}
}
