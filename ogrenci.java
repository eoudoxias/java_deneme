import java.util.Scanner;

public class ogrenci {
	private String adi;
	private String soyadi;
	private int vize;
	private int fina;
	private double ortalama;
	
	public ogrenci(){	/*parametresiz ilklendirme yapýlýyor. Yapýlandýrýcý bu oluyor. boþ deðerli oluyor bu þekilde*/
		adi="";
		soyadi="";
		vize=-1;
		fina=-1;
		ortalama=-1;
	} 
	
	public ogrenci(String adi,String soyadi){ /*parametreli ilklendirme*/
		this.adi=adi;
		this.soyadi=soyadi;
	}
	
	public ogrenci (String adi, String soyadi, int vize, int fina){ /*parametli ilklendirme yapýyor. yapýlandýrýcý*/
		this.adi=adi;
		this.soyadi=soyadi;
		this.vize=vize;
		this.fina=fina;
	}
	
	public double ort(int viz, int fin){ //metod, iþlem yaptýrýp döndürürsek metod oluyor
		double ort=vize*0.40+fina*0.60;
		return ort;
	}
	
	public double geckal(double orta){
		if (orta<=50)
		
			System.out.print("Kaldý");
		
		else 
		
			System.out.print("Gecti");
	
		return orta;
		
		
	}
	
	public String getAdi() {
		return adi;
	}



	public void setAdi(String adi) {
		this.adi = adi;
	}



	public String getSoyadi() {
		return soyadi;
	}



	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}



	public int getVize() {
		return vize;
	}



	public void setVize(int vize) {
		this.vize = vize;
	}



	public int getFina() {
		return fina;
	}



	public void setFina(int fina) {
		this.fina = fina;
	}



	public double getOrtalama() {
		return ortalama;
	}



	public void setOrtalama(double ortalama) {
		this.ortalama = ortalama;
	}
	
	
	public void yaz (String s)
	{
			System.out.println(s);
		
	}

}
