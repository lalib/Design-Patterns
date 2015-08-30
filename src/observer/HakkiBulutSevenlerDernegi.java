package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * developed by BURHAN ARAS
 */
public class HakkiBulutSevenlerDernegi implements Dernek {

	private List<Abone> aboneler = new ArrayList<Abone>();

	@Override
	public void smsYolla(String message) {
		System.out.println("Abonelere SMS yollanıyor:"+message);
		for(Abone abone : this.aboneler){
			abone.durumMesaji();
		}

	}

	@Override
	public void aboneEkle(Abone abone) {
		aboneler.add(abone);
	}

}
