package adapter;

/**
 * developed by BURHAN ARAS
 */
public class AdapterMain {

	public static void main(String[] args) {

		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("tarkan.mp3");

		audioPlayer.play("nuri_sesiguzel.mp4");
		audioPlayer.play("hakki_bulut.mp5");
	}
	/**
	 * İlk iki satıra bakalim. Normal bir Audioplayer'imiz var.Tarkanın mp3'ünü
	 * çalıyor normal bir şekilde. Sorun yok çünkü Audioplayer .mp3 çalabiliyor.
	 * Fakat 3. satırda client bir mp4 dosyasi çalmak istiyor. Devreye Nuri
	 * Sesigüzel girmiş.Durum ciddi. Çünkü audioplayerimiz .mp3 dışındaki
	 * formatları desteklemiyor. Bunun için Mp4Player sınıfımız var ama
	 * client'in müzik çalmak için çağırdığı kodu değiştirmek zorunda olmasını
	 * istemiyoruz. Yani AudioPlayer üzerinden istesin yine ne çalmak istiyorsa.
	 * Adapter pattern burada devreye giriyor. Bir MediaAdapter sınıfı
	 * yazıyoruz. Bu MediaAdapter öyle birşey ki hem AudioPlayer'in implemete
	 * ettiği interface'i implemente ediyor hem de Mp4Player sınıfı türünden bir
	 * nesnesi var kendi içinde.Yani hem AudioPlayer'la hem de Mp4Player iile
	 * akraba. Bu durumda her iki formatı da desteklemiş oluyoruz.
	 * 
	 * Şimdi durduk yere
	 * "niye client, Mp4Player türünden bir nesne oluşturup .mp4'ü bunun üzerinden çalmıyor ki?"
	 * demeyin çok ayıp etmiş olursunuz. Amacımız zaten clientin çağırma şeklini
	 * değiştirmemek. Biz arka tarafta desteklediğimiz her yeni format için bir
	 * class ekleyeceğiz ama sevgili client'ımızın haberi olmayacak. O mutlu
	 * dünyasında olan tüm aksiyondan habersiz yaşamaya devam edecek.
	 */

}
