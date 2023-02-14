package ng.INTERFACE;

import ng.CURRENCY.Currency;

public interface Exchangeable {

			final double EarthDollar = 1.00;
			final double MarsMoney = 1.30;
			final double  SaturnSilver = 0.87;
			final double NeptuneNuggets = 2.00;
	
			public void exchange(Currency other, double amount);

			
}
