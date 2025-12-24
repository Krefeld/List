// Einfache JavaFX-App zum Verfolgen aktiver Mitglieder
// Idee: Liste mit Bildern + Namen. Klick => Person wird entfernt (war aktiv)

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class AktivitaetsTracker extends Application {

    static class Mitglied {
        String name;
        Image image;
        Mitglied(String name, Image image) {
            this.name = name;
            this.image = image;
        }
    }

    List<Mitglied> mitglieder = new ArrayList<>();
    VBox listBox = new VBox(10);

    @Override
    public void start(Stage stage) {
        // --- Mitglieder laden (Beispiel) ---
        // Lege im Projektordner einen Ordner "bilder" an
        // z.B. bilder/Tater.png

        //r4
        //in the last "" you need to paste the path where you saved those imgs 
        mitglieder.add(new Mitglied("Tater", new Image(new File("C:\\Users\\YourPcName\\Documents\\.....\\Tater.png").toURI().toString())));





        
        
        refreshList();

        ScrollPane scrollPane = new ScrollPane(listBox);
        scrollPane.setFitToWidth(true);

        Scene scene = new Scene(scrollPane, 400, 600);
        stage.setTitle("Aktivitäts-Tracker");
        stage.setScene(scene);
        stage.show();
    }

    void refreshList() {
        listBox.getChildren().clear();

        for (Mitglied m : mitglieder) {
            HBox row = new HBox(10);
            row.setStyle("-fx-padding: 10; -fx-border-color: lightgray;");

            //ImageView imageView = new ImageView(m.image);
            //imageView.setFitWidth(80);
            //imageView.setPreserveRatio(true);
            ImageView imageView = new ImageView(m.image);
            imageView.setFitWidth(200);
            imageView.setFitHeight(100);
            imageView.setPreserveRatio(true);



            Label nameLabel = new Label(m.name);
            nameLabel.setStyle("-fx-font-size: 16px;");

            Button aktivBtn = new Button("War aktiv");
            aktivBtn.setOnAction(e -> {
                mitglieder.remove(m);
                refreshList();
            });

            row.getChildren().addAll(imageView, nameLabel, aktivBtn);
            listBox.getChildren().add(row);
        }
    }

    public static void main(String[] args) {
        launch();
    }
}

