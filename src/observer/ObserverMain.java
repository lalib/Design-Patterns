package observer;

/**
 * developed by BURHAN ARAS
 */
public class ObserverMain {

	public static void main(String[] args) {

		Dernek dernek = new HakkiBulutSevenlerDernegi();

		Abone musteri1 = new Musteri("Burhan ARAS");
		musteri1.aboneOl(dernek);

		Abone musteri2 = new Musteri("Vin Diesel");
		musteri2.aboneOl(dernek);

		dernek.smsYolla("Sevgili arabeskçiler, Hakkı Bulut'un yeni albümü çıktı.");

	}

	/**
	 * Hollywood filmleri izliyoruz hep. Hollywood Prensibi de buaradan
	 * doğmuştur. "Sen bizi arama, biz seni ararız." derler Hollywood'da. Adamın
	 * iletişim bilgisini alırlar, ihtiyaç duyduklarında ararlar sadece.
	 * 
	 * Observer da aynen böyle bir pattern. Bir yere abone oluyorsun, sonra
	 * onlar birşeye ihtiyaç duyduklarında seni arıyorlar.
	 */

}
