package tekstitilastointia;
 
import java.util.Arrays;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class TekstitilastointiaSovellus extends Application{

    @Override
    public void start(Stage ikkuna){
        
        Label kirjaimetkomp = new Label("Kirjaimia: ");
        Label sanatkomp = new Label("Sanoja: ");
        Label pisinkomp = new Label("Pisin sana on: ");
        
        HBox horbox = new HBox();
        
        TextArea tekstiloota = new TextArea();
        BorderPane boksi = new BorderPane();
        Scene nakyma = new Scene(boksi);
        
        tekstiloota.textProperty().addListener((muutos, vanhaArvo, uusiArvo) ->{
            int merkkeja = uusiArvo.length();
            String[] palat = uusiArvo.split(" ");
            int sanoja = palat.length;
            
            String pisin = Arrays.stream(palat)
                    .sorted((s1,s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            
            
            kirjaimetkomp.setText("Kirjaimia: " + merkkeja);
            sanatkomp.setText("Sanoja: " + sanoja);
            pisinkomp.setText("Pisin sana on: " + pisin);
            
        });
        
        horbox.setSpacing(10);
        horbox.getChildren().add(kirjaimetkomp);
        horbox.getChildren().add(sanatkomp);
        horbox.getChildren().add(pisinkomp);
        
        boksi.setCenter(tekstiloota);
        boksi.setBottom(horbox);
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
        
        
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(TekstitilastointiaSovellus.class);
    }

}
