package abstarctfactory;

/**
 * developed by BURHAN ARAS
 */
public class AbstractFactoryMain {

	public static void main(String[] args) {
		PhoneFactory iPhoneFactory = new IPhoneFactory();
		Phone iPhone = iPhoneFactory.produce();
		System.out.println("iPhone is a " + iPhone.toString());

		PhoneFactory samsungFactory = new SamsungFactory();
		Phone samsungS6 = samsungFactory.produce();
		System.out.println("Samsung S6 is a " + samsungS6.toString());

	}

	/**
	 * Abstract Factory, birbiriyle ilişkili olan, biraraya gelince daha komplex
	 * bir nesne oluşturacak parçaların bir araya getirilmesi için kurulan
	 * abstract bir yapıdır. Abstract olmasının avantajı esneklik sağlamasıdır.
	 * Çünkü SOLID tasarım prensiplerinden 5.si yani Dependency Inversion'a göre
	 * sistemler concreate yapılar üzerine değil, abstract yapılar üzerine
	 * kurulmalıdırlar.
	 * 
	 * 
	 * 
	 * Factory method ile Abstract Fasctory arasındaki fark : Factory methodda
	 * amacımız sadece object üretimini subclass'lara havale etmek. Ve bir
	 * interface'in objesini üretmek. Abstract Factory'de ise bir biriyle
	 * ilişkili objeleri bir araya getirerek daha komplex bir nesne üretiyoruz.
	 */
}
