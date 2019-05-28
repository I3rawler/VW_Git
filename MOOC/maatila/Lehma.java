package maatila;

import java.util.Random;

public class Lehma implements Lypsava, Eleleva{
    
	private String nimi;
	private double utareet;
	private double maara;
    
	private static final String[] NIMIA = new String[]{
	"Anu", "Arpa", "Essi", "Heluna", "Hely",
	"Hento", "Hilke", "Hilsu", "Hymy", "Matti", "Ilme", "Ilo",
	"Jaana", "Jami", "Jatta", "Laku", "Liekki",
	"Mainikki", "Mella", "Mimmi", "Naatti",
	"Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
	"Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    
	public Lehma(){
   	 
    	this.nimi = NIMIA[new Random().nextInt(NIMIA.length)];
    	this.utareet = 15 + new Random().nextInt(26);
   	 
	}
    
	public Lehma(String nimi){
   	 
    	this.nimi = nimi;
    	this.utareet = 15 + new Random().nextInt(26);
   	 
	}
    
	public String getNimi(){
    	return this.nimi;
	}
    
	public double getTilavuus(){
    	return this.utareet;
	}
    
	public double getMaara(){
    	return this.maara;
	}
    
	@Override
	public String toString(){
   	 
    	return this.nimi + " " + this.maara + "/" + this.utareet;
   	 
	}
    
	@Override
	public double lypsa(){
            
            double siirrettava = 0;
            siirrettava += this.maara;
            
            this.maara = 0;
            
            return siirrettava;
	}
    
	@Override
	public void eleleTunti(){
   	 
    	this.maara += Math.ceil(new Random().nextDouble());
        
            if(this.maara > this.utareet){
                this.maara = this.utareet;
            }
   	 
	}
    
}



