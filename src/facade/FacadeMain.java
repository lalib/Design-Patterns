package facade;

/**
 * developed by BURHAN ARAS
 */
public class FacadeMain {

	public static void main(String[] args) {
		MortGageFacade mortgage = new MortGageFacade();
		boolean isEligible = mortgage.isEligible("Burhan ARAS", 25000);

		System.out.println("Credit for Burhan ARAS is "
				+ (isEligible ? "Approved" : "Rejected"));

	}

	/**
	 * Bankaya gidip Mortgage başvurusunda bulundunuz. Krediye uygun musunuz
	 * diye kontrol edilmesi gerek.Bunun için 3 farklı sisteme gidip kontrol
	 * yapılması gerek. 
	 * 1. Başka bankalara borcu var mı? 
	 * 2. Vergi borcu var mı?
	 * 3. Yeterince malı mülkü var mı?
	 * 
	 * Bu 3 farklı sisteme ait nesneler var ve bunların hepsini tek tek
	 * çağırmamız gerek. Fakat client'imiz bu listeyi bilmek zorunda olsun
	 * istemiyoruz. Bu nedenle tüm bunları bir Facade sınıf içinde topluyoruz.
	 * MortGageFacade içindeki isEligible() metodu bizim için Facade Metod. Tüm
	 * karmaşık algoritmayı kendi içinde toplayıp, dışarıya çok basit bir
	 * arayüzle açtı.
	 * 
	 * Facade metod, karmaşık sub-sistemleri kendi içinde toplayarak, dışarıya
	 * high-level, daha düzgün, sade ve kullanımı kolay bir arayüz açar.
	 */
}
