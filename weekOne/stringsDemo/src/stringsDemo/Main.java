package stringsDemo;

public class Main {
	public static void main(String [] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);
		
		/*System.out.println("Eleman sayısı : "+mesaj.length());//karakter sayısını verir
		System.out.println("5. eleman : "+mesaj.charAt(4));//5. karakteri verir
		System.out.println(mesaj.concat(" Yaşasın!"));
		System.out.println(mesaj);
		System.out.println(mesaj.startsWith("A"));
		System.out.println(mesaj.endsWith("."));
		char[] karakterler = new char[5];
		//mesaj.getChars(srcBegin: 0, srcEnd: 5,karakterler, dstBegin: 0);
		//System.out.println(karakterler);
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf('a'));//a kaçıncı eleman,,,ilk bulduğu elemanda işlemi bitirir
		System.out.println(mesaj.lastIndexOf("a"));//en sondaki a kaçıncı eleman
		*/
		
		String yeniMesaj = mesaj.replace(' ', '-');//1. yerdeki elemanlar yerine 2. yeri yaz
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2));//2. indexinden itibaren yaz
		System.out.println(mesaj.substring(2,5));//5'i dahil etmez
		
		for(String kelime:mesaj.split(" ")) {//her kelimeyi alt alta yazar
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());//hepsi küçük harf
		System.out.println(mesaj.toUpperCase());//hepsi büyük harf
		System.out.println(mesaj.trim());//başındaki ve sonundaki boşlukları atar
		
		
	}
}
