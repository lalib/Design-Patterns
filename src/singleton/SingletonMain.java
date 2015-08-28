package singleton;

/**
 * developed by BURHAN ARAS
 */
public class SingletonMain {

	public static void main(String[] args) {

		Elvis elvis1 = Elvis.instance();
		Elvis elvis2 = Elvis.instance();

		if (elvis1.equals(elvis2)) {
			System.out.println("Elvis is the Singleton!");
		} else {
			System.out.println("Michael Jackson maybe is better.");
		}
	}

	/**
	 * Yukarıda görüldüğü gibi Elvis.instance() metoduyla iki defa nesne ürettik
	 * ama ikisi de birbirine eşit çıktı. Çünkü aynı nesneler. İsterseniz
	 * adreslerini de yazdırıp kontrol edebilirsiniz. Çünkü Elvis'i Singleton
	 * olarak tanımladık. Yani bu nesnenin yalnız tekbir örneği olabilir. Olur
	 * mu olmaz mı demeyin, iki tane Elvis olmaz. Ayrıca multithreading
	 * durumlarında Singleton'umuz güme gitmesin diye synchronized ile double
	 * check yöntemi kullandık.
	 */

}
