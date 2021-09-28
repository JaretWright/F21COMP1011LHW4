package com.example.f21comp1011lhw4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("number-input-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("North American Dialling Plan Analyzer");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();

//        String s1 = new String("JAVA");
//        String s2 = new String("JAVA");
//        System.out.println("s1.equals(s2)) : " + s1.equals(s2));
//        System.out.printf("s1 == s2 : %b%n", s1==s2);
//
//        String s3 = "Java";
//        String s4 = "Java";
//
//        System.out.printf("s3 == s4 :  %b%n", s3==s4);
//
//        System.out.printf("s1.compareTo(s3) : %d%n", s1.compareTo(s3));
//        System.out.printf("s1.compareTo(s2) : %d%n", s1.compareTo(s2));
//
//        System.out.printf("s1.concact(s2) : %s%n", s1.concat(s2));
//        System.out.printf("s1 + s2 : %s%n", s1 + s2);
//
//        System.out.printf("Supercalifragilisticexpialidocious.contains(\"Exp\") : %b%n", "Supercalifragilisticexpialidocious".contains("Exp"));
//        System.out.printf("Supercalifragilisticexpialidocious.contains(\"fragil\") : %b%n", "Supercalifragilisticexpialidocious".contains("fragil"));
//
//        System.out.println(String.format("%.1f%% %n", 97.65354));
//
//        System.out.printf("Supercalifragilisticexpialidocious.substring(4) : %s%n", "Supercalifragilisticexpialidocious".substring(4));
//        System.out.printf("705-555-1234 : area code is : '%s'%n", "705-555-1234".substring(0,3));
//
//        System.out.printf("Supercalifragilisticexpialidocious.replaceAll(\"a\",\"ZZZZ\") : %s%n",
//                                "Supercalifragilisticexpialidocious".replaceAll("a","ZZZZ"));
    }
}