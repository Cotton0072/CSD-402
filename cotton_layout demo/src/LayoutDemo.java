/**
 * LayoutDemo.java
 * Author: Will Cotton
 * Date: March 2026
 *
 * Description:
 * This JavaFX program demonstrates the use of two layout panes:
 * HBox (horizontal layout) and VBox (vertical layout).
 *
 * The program creates a window that displays:
 * - An HBox containing three horizontally aligned buttons.
 * - A VBox containing a title label and three vertically stacked input fields.
 *
 * This file is intended to accompany a research paper on JavaFX layout panes.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class LayoutDemo extends Application {

    @Override
    public void start(Stage stage) {

        // ---------------------------------------------------------
        // HBox Example (Horizontal Layout)
        // ---------------------------------------------------------
        HBox hbox = new HBox(10); // spacing of 10 pixels
        hbox.setPadding(new Insets(10));
        hbox.setAlignment(Pos.CENTER);

        Button homeBtn = new Button("Home");
        Button profileBtn = new Button("Profile");
        Button settingsBtn = new Button("Settings");

        hbox.getChildren().addAll(homeBtn, profileBtn, settingsBtn);


        // ---------------------------------------------------------
        // VBox Example (Vertical Layout)
        // ---------------------------------------------------------
        VBox vbox = new VBox(12); // spacing of 12 pixels
        vbox.setPadding(new Insets(15));
        vbox.setAlignment(Pos.TOP_CENTER);

        Label title = new Label("User Login");
        TextField usernameField = new TextField();
        usernameField.setPromptText("Enter username");

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Enter password");

        Button loginBtn = new Button("Login");

        vbox.getChildren().addAll(title, usernameField, passwordField, loginBtn);


        // ---------------------------------------------------------
        // Combine HBox and VBox in a BorderPane
        // ---------------------------------------------------------
        BorderPane root = new BorderPane();
        root.setTop(hbox);
        root.setCenter(vbox);

        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("JavaFX HBox and VBox Demo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
