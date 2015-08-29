package facade;

/**
 * developed by BURHAN ARAS
 */
public class MortGageFacade {

	private OtherBanks otherBanks = new OtherBanks();
	private TaxOffice taxOffice = new TaxOffice();
	private Bank bank = new Bank();
	
	public boolean isEligible(String customerName, int creditAmount) {
		if(otherBanks.hasBadLoans(customerName)){
			return false;
		}
		if(taxOffice.hasTaxDebt(customerName)){
			return false;
		}
		if(!bank.isRichEnough(customerName, creditAmount)){
			return false;
		}
		return true;
	}

}
