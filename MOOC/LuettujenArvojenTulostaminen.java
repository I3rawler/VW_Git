
import java.util.ArrayList;
import java.util.Scanner;

public class LuettujenArvojenTulostaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();
        
        while(true){
            String rivi = lukija.nextLine();
            
            if(rivi.equals("")){
                break;
            }
            
            lista.add(rivi);
        }
        
        lista.stream()
                .forEach(rivi -> System.out.println(rivi));
        
    }
}
