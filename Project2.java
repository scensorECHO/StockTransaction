/* Programmer Name: Tom Carrio
Project Name: Project2
Course, Day, and Time: CIS1500 Wednesday 6:00pm
Date of Completion: 4:27pm, May 26th, 2014
Purpose: Using the information provided for Joe's stock purchases in Acme Software, Inc., dispay the amount of money 
he paid for the stock, the amount of commission he paid his broken when he bought it, the amount that he sold the
stock for, the amount of commission the broker made when he sold it, and the amount of profit that Joe made after 
selling his stock and paying the two commissions to his broker. 
*/

public class Project2 {
	
	public static void main(String[] args) {

		// declaring all variables with starting value 0

		int ownedStock = 0; // the initial amount of stock that Joe currently owns
		int soldStock = 0; // the initial amount of stock that Joe has sold
		double valueStock = 0; // the current value of the stock, to be determined
		double valueAssets = 0; // the value of his assets
		double valueSold = 0; // the value of the stocks being sold
		double commissionPercent = 0; // the percentage of the amount paid to go to the stockbroker
		double commissionBought = 0; // the calculated amount paid to the stockbroker when bought
		double commissionSold = 0; // the calculated amount paid to the stockbroker when sold
		float profitMade = 0; // the calculated profit of the transaction
		//profitMade calculated a long decimal repetend, made it a float to round up to ".80"

		/* Joe purchases 1000 shares of stock, currently valued at 32.87 a share, through his stockbroker who
		 * charges 2% of the amount he pays for commission.
		 */
		ownedStock = ownedStock + 1000; // bought 1000 shares of stock in Acme
		valueStock = 32.87; // the current value of the stock upon purchase
		valueAssets = ownedStock * valueStock; // the value of assets, according to amount owned and stock worth
		commissionPercent = 0.02; // set commission percentage value to 2%, or 0.02
		commissionBought = valueAssets * commissionPercent; // amount of commission owed to stockbroker

		// output the amount of money Joe paid for the stock
		System.out.println("The amount Joe paid for the stock: " + valueAssets);
		// output the amount of money Joe paid the stockbroker
		System.out.println("The amount Joe paid the broker when he bought the stock: " + commissionBought);

		//Two weeks later, Joe sells the stock

		soldStock = 1000; // amount of stock Joe is selling
		ownedStock = ownedStock - soldStock; // new amount of stock that Joe owns- it's zero lol what a sellout
		valueStock = 33.92; // the current value of the stock 
		valueSold = soldStock * valueStock; // the value of the sold stocks
		// commissionPercent does not change
		commissionSold = valueSold * commissionPercent; // amount of commission owed to stockbroker

		// output the amount that Joe sold the stock for
		System.out.println("The amount Joe sold the stock for: " + valueSold);
		// output the amount of commission Joe paid his broker when he sold the stock
		System.out.println("The amount Joe paid his broker when he sold the stock: " + commissionSold);

		// calculate the amount of profit, between the values of assets, subtracting the amount paid in 
		//commission
		profitMade = (float)(valueSold - valueAssets - commissionBought - commissionSold); // profit made overall
		/* casting profitMade as a float although there were double's, because the profitMade would calculate 
		 * and save as "-285.79999999999995" which was not a very clean output, which rounded up to -285.80
		 */

		// display  the amount of profit that Joe made after selling his stock and paying the two commissions to 
		// his broker
		System.out.println("The amount Joe profited in the transaction: " + profitMade);


	} //end main method

} // end class Project2