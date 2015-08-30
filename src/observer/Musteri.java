package observer;

/**
 * developed by BURHAN ARAS
 */
public class Musteri implements Abone {

	private String name;

	public Musteri(String name) {
		this.name = name;
	}

	@Override
	public void aboneOl(Dernek dernek) {
		dernek.aboneEkle(this);

	}

	@Override
	public void durumMesaji() {
		System.out.println("Ben "+this.name+", SMS ulaştı bana.");
		
	}

}
