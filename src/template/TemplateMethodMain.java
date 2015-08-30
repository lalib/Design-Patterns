package template;

/**
 * developed by BURHAN ARAS
 */
public class TemplateMethodMain {

	public static void main(String[] args) {
		Game football = new Football();
		football.play();

		Game basketball = new Basketball();
		basketball.play();

		Game carRace = new CarRace();
		carRace.play();

	}
	/**
	 * Template method, jenerik bir işi yapmanın kesin adımlarını birarada
	 * toplayan metoddur. Örneğin, her oyunun bir init edilmesi, bir başı bir de
	 * sonu vardır. Hangi oyun olursa olsun. Oyunun başlaması ya da bitmesi
	 * kendi içinde farklılık gösterir fakat adımlar her oyun için aynıdır.
	 * İnit, başla ve bitir.
	 * 
	 *  Biz burada Game sınıfının içinde play() isimli bir
	 * metod tanımladık. Bu metod bir Template Metod'dur. Template design
	 * pattern da tam olarak budur. Bu metodun içinde sırasını bizim
	 * belirlediğimiz üç tane abstract sınıf var. Alt sınıflara siyoruz ki, bu
	 * metodların çalışma sırasını ben belirledim. Bunun dışına çıkamazsın, ama
	 * içini istediğin gibi implemente edebilirsin.
	 * 
	 * Template method sıklıkla karşılaşılan bir patterndir. Kullanımı da kolay vebasittir. 
	 * 
	 */

}
