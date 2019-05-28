
package maatila;


public class Lypsyrobotti {
    
    private Maitosailio sailio;
    
    public Lypsyrobotti(){
        
        
    }
    
    public Maitosailio getMaitosailio(){
        
        if(this.sailio == null){
            return null;
        }
        
        return this.sailio; 
        
    }
    
    public void setMaitosailio(Maitosailio maitosailio){
        
        this.sailio = maitosailio;
        
    }
    
    public void lypsa(Lypsava lypsava){
        
        if(this.sailio == null){
            System.out.println("Maidot menevät hukkaan!");
            return;
        }
        
        this.sailio.lisaaSailioon(lypsava.lypsa());
        
    }
    
}
