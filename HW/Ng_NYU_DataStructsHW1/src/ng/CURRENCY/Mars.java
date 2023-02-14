package ng.CURRENCY;

import java.text.DecimalFormat;

import ng.INTERFACE.Exchangeable;

public class Mars extends Currency {

	public Mars(double totalFunds) {
		super(totalFunds);
		this.setCurrencyName("MarsMoney");
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public double toEarthDollars(double amount) {
		// TODO Auto-generated method stub
		double result =0;
		result = amount / Exchangeable.MarsMoney;
		return result;
	}

	@Override
	public double fromEarthDollars(double EarthDollars) {
		// TODO Auto-generated method stub
		double result = 0;
		result = EarthDollars * Exchangeable.MarsMoney;
		return result;
	}



	@Override
	public void exchange(Currency other, double amount) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("0.00");
		
		if(amount > this.getTotalFunds()) {
			System.out.println("Uh oh - Mars only has an available balance of $" + df.format(this.getTotalFunds()) + ", which is less than $" + df.format(amount) + "!\n");
			return;
		}
		
		System.out.println("Converting from " +this.getCurrencyName() + " to  "+ other.getCurrencyName() + " and initiating transfer...");
		
		double ed = toEarthDollars(amount);
		System.out.println("$" + df.format(amount) + " " + this.getCurrencyName() + " = $" + df.format(ed) + " EarthDollars = " 
		+ df.format(other.fromEarthDollars(ed)) + " " + other.getCurrencyName());
		
		this.setTotalFunds(this.getTotalFunds() - amount);
		other.setTotalFunds(other.getTotalFunds() + other.fromEarthDollars(ed));
		
		System.out.println("Mars has a total of $" + df.format(this.getTotalFunds()) + " " + this.getCurrencyName());
		
		if(other.getCurrencyName().equals("NeptuneNuggets")) {
			System.out.println("Neptune has a total of $" + df.format(other.getTotalFunds()) + " " + other.getCurrencyName());
			System.out.println();
		}
		if(other.getCurrencyName().equals("SaturnSilver")) {
			System.out.println("Saturn has a total of $" + df.format(other.getTotalFunds()) + " " + other.getCurrencyName());
			System.out.println();
		}
		//Mars has a total of $75.00 MarsMoney
		//Saturn has a total of $116.73 SaturnSilver
	}

}
