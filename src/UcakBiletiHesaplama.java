import java.util.Scanner;

public class UcakBiletiHesaplama {

	public static void main(String[] args) {
		
		int yas, yolculukTipi;
		
		double mesafe, tutar;
				
	    Scanner input = new Scanner(System.in);
	    
	    System.out.print("Mesafeyi km türünden giriniz : ");
	    mesafe = input.nextDouble();
	    
	    	    
	    System.out.print("Yaşınızı giriniz : ");
	    yas = input.nextInt();
	    
	    System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
	    yolculukTipi = input.nextInt();
	    
	    if(yas <0 || mesafe <0 || (yolculukTipi != 1 && yolculukTipi !=2)) System.out.println("Hatalı Veri Girdiniz !");
	    
	    else {
	    	
		    tutar = mesafe * 0.10;
		    
		    if (yas <12) tutar = tutar * 0.5;
		    
		    else if (yas >=12 && yas <=24) tutar = tutar * 0.9;
		    
		    else if (yas >= 65) tutar = tutar * 0.7;
		    
		    // System.out.println(tutar); //test amaçlı gidiş gönüş öncesi tutar hesabı.
		    
		    if (yolculukTipi == 2) tutar = tutar * 0.8 * 2;
		    
		    // System.out.println(tutar); //test amaçlı gidiş gönüş sonrasıi tutar hesabı.	    
    	
		    System.out.println("Toplam Tutar = "+tutar+" TL");
	    
	    }
	    
	   
	}

}
