package singleton;

/**
 * developed by BURHAN ARAS
 */
public class Elvis {

	private static Elvis elvis = null;
	private static Object lock = new Object();
	
	private Elvis(){
		System.out.println("Since constructor is private, noone can create an Elvis from outside.");
	}
	
	public static Elvis instance() {

		if(elvis == null){
			synchronized (lock) {
				if(elvis == null){
					elvis = new Elvis();
				}
			}
		}

		return elvis;
	}

}
