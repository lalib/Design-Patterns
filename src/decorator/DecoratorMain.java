package decorator;

/**
 * developed by BURHAN ARAS
 */
public class DecoratorMain {

	public static void main(String[] args) {

		Widget textField = new BorderDecorator(new ScrollDecorator(
				new TextField("Erol Büyükburç")));
		textField.draw();

	}

	/**
	 * Open-Closed prensipten bahsettik. Open to be extended, closed to be
	 * changed dedik.Yeni bir özellik eklemek istiyorsan, hiç birşeyi
	 * değiştirme, yeni bir class ekle dedik. Decorator Pattern tam olarak bunun
	 * içindir. Elimizde bir textField var, bir süre sonra scroll ekleyelim
	 * dedik bu textfield'a. Biraz zaman geçti border ekleyelim dedik. Textfield
	 * objesinin içindeki draw() metodunda hiçbirşey yapmıyoruz. İçinde
	 * Textfield bulunduran (composition denir buna) yeni decorator classlar
	 * yazıyoruz. Objeleri sürekli içiçe geçiriyoruz. Yani objenin hiçbir
	 * metodunda değişiklik yapmıyoruz. Sizin de aklınıza Textfield'a yeni bir
	 * özellik geldi diyelim. Yapacağınız şey Decorator'u extend eden yeni bir
	 * decorator classı yazacaksınız. Textfield örneği vermemiz boşuna değil,
	 * önyüz komponentlerinde bu pattern sıklıkla kullanılır. Uncle Bob amcamız
	 * mutlu, biz mutlu, herkes mutlu!
	 */

}
