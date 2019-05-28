package nappijatekstikentta;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class NappiJaTekstikenttaSovellus extends Application{


    public static void main(String[] args) {
        System.out.println("Hello world!");
        
        launch(NappiJaTekstikenttaSovellus.class);
    }
    
    @Override
    public void start(Stage ikkuna){
        
        Button nappikomp = new Button("Buttoni");
        TextField tekstikentta = new TextField();
        
        FlowPane kompryhma = new FlowPane();
        kompryhma.getChildren().add(tekstikentta);
        kompryhma.getChildren().add(nappikomp);
        
        Scene nakyma = new Scene(kompryhma);
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
        
    }

}
