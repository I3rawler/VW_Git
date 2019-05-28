
package maatila;

import java.util.List;

public class Navetta {
    
    private Maitosailio sailio;
    private Lypsyrobotti robotti;

    public Navetta(Maitosailio maitosailio){
        
        this.sailio = maitosailio;
        
    }
    
    public Maitosailio getMaitosailio(){
        
        return this.sailio;
        
    }
    
    public void asennaLypsyrobotti(Lypsyrobotti lypsyrobotti){
        
        this.robotti = lypsyrobotti;
        this.robotti.setMaitosailio(this.sailio);
        
    }
    
    public void hoida(Lehma lehma) throws IllegalStateException{
        
        if(this.robotti == null){
            throw new IllegalStateException();
        }
        
        this.robotti.lypsa(lehma);
        
    }
    
    public void hoida(List<Lehma> lehmat) throws IllegalStateException{
        
        if(this.robotti == null){
            throw new IllegalStateException();
        }
        
        for(Lehma lehma: lehmat){
            this.robotti.lypsa(lehma);
        }
        
    }
    
    @Override
    public String toString(){
        
        return this.sailio.toString();
        
    }
    
}
