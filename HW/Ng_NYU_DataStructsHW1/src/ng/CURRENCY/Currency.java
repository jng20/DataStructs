package ng.CURRENCY;

import ng.INTERFACE.Exchangeable;

public abstract class Currency implements Exchangeable{

	private String currencyName;
	private double totalFunds;
	public Currency(double totalFunds) {
		//super();
		this.totalFunds = totalFunds;
	}
	
	public String getCurrencyName() {
		return currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	public double getTotalFunds() {
		return totalFunds;
	}

	public void setTotalFunds(double totalFunds) {
		this.totalFunds = totalFunds;
	}

	public abstract double toEarthDollars(double amount);
	public abstract double fromEarthDollars(double EarthDollars);
}
