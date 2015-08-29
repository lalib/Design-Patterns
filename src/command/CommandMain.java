package command;

public class CommandMain {

	public static void main(String[] args) {
		Television tv = new Television();
		RemoteController remote = new RemoteController(tv);

		remote.click(Keys.ON);
		remote.click(Keys.OFF);
	}
	/**
	 * Comand Pattern'da objenin davranışı ile durumunu birbirinden soyutlamış
	 * oluyoruz. Biz sadece kumandanın tuşuna basıyoruz. Arka tarafta ne
	 * olduğunu bilmemize gerek yok. Yazdığımız JFrame uygulamalarında
	 * butonların onClick eventlerini hatırladınız mı? Ya da addActionListener()
	 * size tanıdık geldi mi? Bunların hepsi Command Pattern'dir aslında.
	 */

}
