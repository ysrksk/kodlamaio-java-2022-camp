package inheritanceDemo;

public class Main {
	public static void main(String[] args) {
		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		TarimKrediManager tarimKrediManager = new TarimKrediManager();
		
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new AskerKrediManager());
	}
}
