
package maatila;

import java.util.ArrayList;
import java.util.List;

public class Maatila implements Eleleva{
    
    private String omistaja;
    private Navetta navetta;
    private List<Lehma> lehmat;
    
    public Maatila(String nimi, Navetta navetta){
        
        this.omistaja = nimi;
        this.navetta = navetta;
        this.lehmat = new ArrayList<>();
        
    }
    
    @Override
    public void eleleTunti() throws IllegalStateException{
        
        if(this.lehmat == null){
            throw new IllegalStateException();
        }
        
        for(Lehma lehma: this.lehmat){
            lehma.eleleTunti();
        }
        
    }
    
    public String getOmistaja(){
        
        return this.omistaja;
        
    }
    
    public void lisaaLehma(Lehma lehma){
        
        this.lehmat.add(lehma);
        
    }
    
    public void hoidaLehmat(){
        
        this.navetta.hoida(this.lehmat);
        
    }
    
    public void asennaNavettaanLypsyrobotti(Lypsyrobotti lypsyrobotti){
        
        this.navetta.asennaLypsyrobotti(lypsyrobotti);
        
    }
    
    @Override
    public String toString(){
        
        if(this.lehmat.isEmpty()){
            return "Maatilan omistaja: " + this.omistaja + "\n Navetan maitosailiö: " + this.navetta.getMaitosailio() + "\n Ei lehmiä.";
        }
        
        return "Maatilan omistaja: " + this.omistaja + "\nNavetan maitosailiö: " + this.navetta.getMaitosailio() + "\nLehmät:\n  " + this.lehmat.toString();
    }
    
    
    
}
