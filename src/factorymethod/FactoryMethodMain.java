package factorymethod;

/**
 * developed by BURHAN ARAS
 */
public class FactoryMethodMain {

	public static void main(String[] args) {

		CPU cpu = CpuFactory.produce(CpuTypes.A4);
		System.out.println("Created " + cpu.toString());

		cpu = CpuFactory.produce(CpuTypes.CORTEXA5);
		System.out.println("Created " + cpu.toString());

	}
	/**
	 * Factory Method ile object üretim işini subclass'lara havale ediyoruz. Biz
	 * sana ihtiyaç duydugumuz nesneyi belirten bir parametre yollayalım, sen
	 * objeyi üret bize servis et.
	 * 
	 * Factory method ile Abstract Fasctory arasındaki fark : Factory methodda
	 * amacımız sadece object üretimini subclass'lara havale etmek. Ve bir
	 * interface'in objesini üretmek. Abstract Factory'de ise bir biriyle
	 * ilişkili objeleri bir araya getirerek daha komplex bir nesne üretiyoruz.
	 */

}
