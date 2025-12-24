package Java.src;
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
        // z.B. bilder/Krefeld.png

        //r4
        mitglieder.add(new Mitglied("Krefeld", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Krefeld.png").toURI().toString())));
        mitglieder.add(new Mitglied("JayLord", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\JayLord.png").toURI().toString())));
        mitglieder.add(new Mitglied("CheatCodes", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\CheatCodes.png").toURI().toString())));  
        mitglieder.add(new Mitglied("dd", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\dd.png").toURI().toString())));
        mitglieder.add(new Mitglied("LadyArwen", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\LadyArwen.png").toURI().toString())));
        mitglieder.add(new Mitglied("Maddie", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Maddie.png").toURI().toString())));
        mitglieder.add(new Mitglied("Ray", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Ray.png").toURI().toString())));
        mitglieder.add(new Mitglied("Sunef", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Sunef.png").toURI().toString())));
        
        //r5
        mitglieder.add(new Mitglied("myamay808", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\mya.png").toURI().toString())));
        
        //r3
        mitglieder.add(new Mitglied("Zepp", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Zepp.png").toURI().toString())));
        mitglieder.add(new Mitglied("Zzzz", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Zzzz.png").toURI().toString())));
        mitglieder.add(new Mitglied("TheAnswer", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\TheAnswer.png").toURI().toString())));
        
        mitglieder.add(new Mitglied("Puppy", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Puppy.png").toURI().toString())));
        mitglieder.add(new Mitglied("LordBoston", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\LordBoston.png").toURI().toString())));
        mitglieder.add(new Mitglied("CheapCodes", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\CheapCodes.png").toURI().toString())));
        mitglieder.add(new Mitglied("RocketFire", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\RocketFire.png").toURI().toString())));
        mitglieder.add(new Mitglied("Anaya", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Anaya.png").toURI().toString())));
        mitglieder.add(new Mitglied("Esmia", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Esmia.png").toURI().toString())));
        
        mitglieder.add(new Mitglied("Ayse", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Ayse.png").toURI().toString())));
        mitglieder.add(new Mitglied("Jeja", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Jeja.png").toURI().toString())));
        mitglieder.add(new Mitglied("BaoHann", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\BaoHann.png").toURI().toString())));
        mitglieder.add(new Mitglied("Chikawaka", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Chikawaka.png").toURI().toString())));
        mitglieder.add(new Mitglied("Nan", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Nan.png").toURI().toString())));
        mitglieder.add(new Mitglied("Dronning", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Dronning.png").toURI().toString())));
        
        mitglieder.add(new Mitglied("Leroy", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Leroy.png").toURI().toString())));
        mitglieder.add(new Mitglied("Finchy", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Finchy.png").toURI().toString())));
        mitglieder.add(new Mitglied("Tater", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Tater.png").toURI().toString())));     
        mitglieder.add(new Mitglied("Zion", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Zion.png").toURI().toString())));
        mitglieder.add(new Mitglied("flowne", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\flowne.png").toURI().toString())));
        mitglieder.add(new Mitglied("Ai Vay Taa", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Ai Vay.png").toURI().toString())));
        
        mitglieder.add(new Mitglied("Shizukon", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Shizukon.png").toURI().toString())));
        mitglieder.add(new Mitglied("Yunjungz", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\yunj.png").toURI().toString())));
        mitglieder.add(new Mitglied("ngocha", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\ngocha.png").toURI().toString())));
        mitglieder.add(new Mitglied("kataza", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\kataza.png").toURI().toString())));
        mitglieder.add(new Mitglied("Porkchop", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Porkchop.png").toURI().toString())));
        mitglieder.add(new Mitglied("Design2MIB", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Design2MIB.png").toURI().toString())));
        
        mitglieder.add(new Mitglied("Jino", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Jino.png").toURI().toString())));
        mitglieder.add(new Mitglied("Giang HO", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Giang Ho.png").toURI().toString())));
        mitglieder.add(new Mitglied("Mariyati", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Mariyati.png").toURI().toString())));
        mitglieder.add(new Mitglied("Grant", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Grant.png").toURI().toString())));
        mitglieder.add(new Mitglied("Smith", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Smith.png").toURI().toString())));
        mitglieder.add(new Mitglied("Ben Wu", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Ben Wu.png").toURI().toString())));
        
        mitglieder.add(new Mitglied("Moo", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Moo.png").toURI().toString())));
        mitglieder.add(new Mitglied("ian", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\ian.png").toURI().toString())));
        mitglieder.add(new Mitglied("Naoki", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Naoki.png").toURI().toString())));
        mitglieder.add(new Mitglied("Meian", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Meian.png").toURI().toString())));
        mitglieder.add(new Mitglied("Akram", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Akram.png").toURI().toString())));
        mitglieder.add(new Mitglied("Mouse", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Mouse.png").toURI().toString())));
        
        mitglieder.add(new Mitglied("Yazanme", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Yazanme.png").toURI().toString())));
        mitglieder.add(new Mitglied("Biii", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Biii.png").toURI().toString())));
        mitglieder.add(new Mitglied("theo", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\theo.png").toURI().toString())));
        mitglieder.add(new Mitglied("Nemo", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Nemo.png").toURI().toString())));
        mitglieder.add(new Mitglied("RedRose", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\RedRose.png").toURI().toString())));
        mitglieder.add(new Mitglied("Djaylik", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Djaylik.png").toURI().toString())));
        
        mitglieder.add(new Mitglied("Maks", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Maks.png").toURI().toString())));
        mitglieder.add(new Mitglied("SOEE", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\SOEE.png").toURI().toString())));
        mitglieder.add(new Mitglied("Daiki", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Daiki.png").toURI().toString())));
        mitglieder.add(new Mitglied("Peter its", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Peter_its.png").toURI().toString())));
        mitglieder.add(new Mitglied("Chaeyoung", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Chaeyoung.png").toURI().toString())));
        mitglieder.add(new Mitglied("Cheetara", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Cheetara.png").toURI().toString())));
        
        mitglieder.add(new Mitglied("山雞", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Bird.png").toURI().toString())));
        mitglieder.add(new Mitglied("虛無飄渺", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Chinese.png").toURI().toString())));
        mitglieder.add(new Mitglied("155cm", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\155cm.png").toURI().toString())));
        mitglieder.add(new Mitglied("Cieen", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Cieen.png").toURI().toString())));
        mitglieder.add(new Mitglied("SADIE", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Sadie.png").toURI().toString())));
        mitglieder.add(new Mitglied("Benedetta", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Benedetta.png").toURI().toString())));
        
        mitglieder.add(new Mitglied("Shrimp", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Shrimp.png").toURI().toString())));
        mitglieder.add(new Mitglied("Te Giac", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Te Giac.png").toURI().toString())));
        mitglieder.add(new Mitglied("Ersin Demi", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Ersin Demi.png").toURI().toString())));
        mitglieder.add(new Mitglied("Zoomers", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Zoomers.png").toURI().toString())));
        mitglieder.add(new Mitglied("Potato", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Potato.png").toURI().toString())));
        mitglieder.add(new Mitglied("Boondoggle", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\boondoogle.png").toURI().toString())));
        
        mitglieder.add(new Mitglied("Kitty", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Kitty.png").toURI().toString())));
        mitglieder.add(new Mitglied("Vika Gud", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Vika Gud.png").toURI().toString())));
        mitglieder.add(new Mitglied("Rusty S", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Rusty S.png").toURI().toString())));
        mitglieder.add(new Mitglied("Robin_Bat", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Robin_Bat.png").toURI().toString())));
        mitglieder.add(new Mitglied("Crabcrab", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Crabcrab.png").toURI().toString())));
        mitglieder.add(new Mitglied("JulietRose", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\JulietRose.png").toURI().toString())));
        
        
        mitglieder.add(new Mitglied("Unico", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Unico.png").toURI().toString())));
        mitglieder.add(new Mitglied("Ark Hour", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Ark Hour.png").toURI().toString())));        
        mitglieder.add(new Mitglied("wicen", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\wicen.png").toURI().toString())));



        //r2
        mitglieder.add(new Mitglied("InariusRed", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\InariusRed.png").toURI().toString())));
        mitglieder.add(new Mitglied("SubtleSpec", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\SubtleSpec.png").toURI().toString())));
        mitglieder.add(new Mitglied("Taxam", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Taxam.png").toURI().toString())));
        mitglieder.add(new Mitglied("Jack6", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Jack6.png").toURI().toString())));
        mitglieder.add(new Mitglied("Nami", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Nami.png").toURI().toString())));
        mitglieder.add(new Mitglied("Sakura", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Sakura.png").toURI().toString())));
        
        //r1
        mitglieder.add(new Mitglied("Kyrus", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Kyrus.png").toURI().toString())));
        mitglieder.add(new Mitglied("DarkEmp", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\DarkEmp.png").toURI().toString())));
        mitglieder.add(new Mitglied("Abdullah", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Abdullah.png").toURI().toString())));
        mitglieder.add(new Mitglied("Grimm", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Grimm.png").toURI().toString())));
        mitglieder.add(new Mitglied("RizBovn", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\RizBoven.png").toURI().toString())));
        mitglieder.add(new Mitglied("PhantomAce", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\PhantomAce.png").toURI().toString())));
        mitglieder.add(new Mitglied("Dalva", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Dalva.png").toURI().toString())));
        mitglieder.add(new Mitglied("Liz", new Image(new File("C:\\Users\\Tomeg\\Documents\\VSCODE\\Java\\src\\bilder\\Liz.png").toURI().toString())));





        
        
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
