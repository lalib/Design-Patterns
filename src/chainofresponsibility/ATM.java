package chainofresponsibility;

/**
 * developed by BURHAN ARAS
 */
public class ATM {
	
	private OneUsdRecogniser oneUsdRecogniser = new OneUsdRecogniser();
	private TenUsdRecogniser tenUsdRecogniser = new TenUsdRecogniser();
	private FiftyUsdRecogniser fiftyUsdRecogniser = new FiftyUsdRecogniser();
	private HundredUsdRecogniser hundredUsdRecogniser = new HundredUsdRecogniser();
	
	private int totalDeposit;
	
	public ATM(){
		// set chain of responsibility
		oneUsdRecogniser.setNext(tenUsdRecogniser);
		tenUsdRecogniser.setNext(fiftyUsdRecogniser);
		fiftyUsdRecogniser.setNext(hundredUsdRecogniser);
		
	}
	
	public void deposit(int amount){
		totalDeposit += oneUsdRecogniser.recognise(amount);
	}

	public int getTotalDeposit() {
		return totalDeposit;
	}

	public void setTotalDeposit(int totalDeposit) {
		this.totalDeposit = totalDeposit;
	}
	

}
