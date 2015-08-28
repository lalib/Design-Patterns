package prototype;

/**
 * developed by BURHAN ARAS
 */
public class PrototypeMain {

	public static void main(String[] args) throws CloneNotSupportedException {

		Image image1 = new Image();
		Image image2 = image1;

		Image cloneImage = (Image) image1.clone();

		System.out
				.println("image1 and image2 is identical since they are pointing same address space. "
						+ "But cloneImage is a different object since it's a clone.");

		System.out.println("image1 address     	: " + image1.toString());
		System.out.println("image2 address 		: " + image2.toString());
		System.out.println("cloneImage address 	: " + cloneImage.toString());

	}
	/**
	 * Dikkat ederseniz image1 ve image2'nin adresleri aynı. Çünkü image2 atama
	 * operatörüyle üretildi. Yani her ikisi de aslında aynı objeyi
	 * gösteriyor.İki farklı ismi olan bir adam gibi. Fakat cloneImage farklı
	 * bir adresi gösteriyor. Çünkü clone() methoduyla oluşturuldu. Klonlandığı
	 * nesnenin tüm özelliklerini kendi bünyesine kopyaladı aslında. Fakat buna
	 * rağmen farklı bir nesne kendisi. Bunu yapmamızın nedeni, obje üretmenin
	 * pahalı olduğu durumlarda kullanmak. Farzedin ki Image nesnesini üretmek
	 * 10 sn. alıyor. Çünkü constructor'un içinde ağır bir iş var, networkten
	 * bir resim indirmek gibi. Her Image ürettiğimizde 10 sn. beklemek demek
	 * olur bu ki buna gerek yok. Prototype'layarak klonlayabiliriz objeyi. Bu
	 * durumda nesne üretim maliyetleri de düşer.
	 */

}
