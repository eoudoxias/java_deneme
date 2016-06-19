import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int not1 = 0,not2 = 0, sayac,gec;
		String isim,soyisim;
		double orta=0;
		Scanner klavye=new Scanner(System.in);
		ogrenci[] ogrenciler = new ogrenci[3];
		
		
		for (sayac=0;sayac<ogrenciler.length;++sayac)
		{
		System.out.println(sayac+1 +". Ýsminizi giriniz:");
		isim=klavye.next();
	
		System.out.println(sayac+1 +". Soyisminizi giriniz:");
		soyisim=klavye.next();
		
		System.out.println(sayac+1 +". 1. sýnav notunuzu giriniz:");
		not1=klavye.nextInt();
		
		System.out.println(sayac+1 +". 2. sýnav notunuzu giriniz:");
		not2=klavye.nextInt();
		
		ogrenciler[sayac]=new ogrenci(isim,soyisim,not1,not2);
		
		}
		
		for (sayac=0;sayac<ogrenciler.length;++sayac)
		{
			
			System.out.println(sayac+1 +".Ýsmi="+ogrenciler[sayac].getAdi()+" Soyisim="+ogrenciler[sayac].getSoyadi()+" Vize="+ogrenciler[sayac].getVize()+" Final="+ogrenciler[sayac].getFina()+" Ortalama="+ogrenciler[sayac].ort(not1, not2)+" Durum="+ogrenciler[sayac].geckal(orta));
			
		}
		
	}

}
