package chainofresponsibility;

/**
 * developed by BURHAN ARAS
 */
public class ChainOfResponsibilityMain {

	public static void main(String[] args) {

		ATM atm = new ATM();
		atm.deposit(1);
		atm.deposit(100);
		atm.deposit(50);
		atm.deposit(5);
		atm.deposit(50);
		atm.deposit(10);

		int total = atm.getTotalDeposit();
		System.out.println("You've deposited " + total + " USD in total.");
	}

	/**
	 * Bir ATM düşünün, içeriye kağıt para veriyoruz. Her bir kağıt parayı
	 * tanıyan farklı bir modül var ATM'nin içinde. Örneğin OneUSD sınıfı sadece
	 * 1 doları tanır. Gelen para 1 dolar mı değil mi sadece bunu bilir. Bizim
	 * sistemimizde 1,10,50 ve 100 doları tanıyan modüller var. Bunun dışındaki
	 * paraları kabul etmiyoruz.
	 * 
	 * ATM isimli sınıf aslında Chain of Responsibility'i implemente ettiğimiz
	 * sınıftır. İçinde UsdRecogniser türünden, her dolar türü için ayrı bir
	 * nesne tanımladık. Constructorun içinde zinciri oluşturuyoruz. Bunlardan
	 * onsUsdRecogniser'i zincirin başına koyduk. Sonra da küçükten büyüğe devam
	 * ettik. Gözünüzde canlandırın, gerçekten bir zincirin halkaları gibi
	 * dizildiler objelerimiz. Her obje kendinden sonraki objeyi tanıyor sadece.
	 * 
	 * İçeri bir para atıldı, OneUsdRecogniser bakar parayı tanıyabilecek miyim
	 * diye. Tanırsa, "Tanıdım, bu 1 dolar!" diye geriye döner. Tanımazsa,
	 * zincirin bir sonraki halkasına yani TenUsdRecogniser'a devreder parayı.
	 * "Ben tanıyamadım, bakalım sen tanıyabilecek misin?" der.
	 * 
	 * Chain of Responsibility böyle bir pattern işte. Aynı türden nesneler,
	 * zincirin halkaları gibi dizilirler. Herkes sadece kendinden sonraki
	 * nesneyi tanır. Zincirin en başındaki nesneyi biz belirliyoruz tabii ki.
	 * Sisteme gelen request'e cevap dönemeyen nesne bunu sonrakine devreder.
	 */
}
