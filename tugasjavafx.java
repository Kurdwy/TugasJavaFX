package tugasjavafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
                 
        TextField tf = new TextField();
        Label labelInput = new Label("First Name               ");
        
        TextField tf2 = new TextField();
        Label labelInput2 = new Label("Last Name               ");
        
        TextField tf3 = new TextField();
        Label labelInput3 = new Label("E-mail Address        ");
        
        TextField tf4 = new TextField();
        Label labelInput4 = new Label("Contact No              ");
        
        TextField tf5 = new TextField();        
        Label labelInput5 = new Label("Password                 ");
        
        TextField tf6 = new TextField();
        Label labelInput6 = new Label("Confirm Password   ");

        Button btnRGS = new Button();       
        btnRGS.setText("Register");
        btnRGS.setTextFill(Color.WHITE);
        btnRGS.setBackground(new Background(new BackgroundFill(Color.BLUE,null,null)));
              
        Group root = new Group();
        HBox panel1 = new HBox();
        HBox panel2 = new HBox();
        HBox panel3 = new HBox();
        HBox panel4 = new HBox();
        HBox panel5 = new HBox();
        HBox panel6 = new HBox();
        HBox panel7 = new HBox();
        
        panel1.getChildren().add(labelInput);
        panel1.getChildren().add(tf);
                
        panel2.getChildren().add(labelInput2);
        panel2.getChildren().add(tf2);
        
        panel3.getChildren().add(labelInput3);
        panel3.getChildren().add(tf3);
        
        panel4.getChildren().add(labelInput4);
        panel4.getChildren().add(tf4);
        
        panel5.getChildren().add(labelInput5);
        panel5.getChildren().add(tf5);
        
        panel6.getChildren().add(labelInput6);
        panel6.getChildren().add(tf6);
        
        panel7.getChildren().addAll(btnRGS);
        
        panel1.setLayoutX(120);
        panel1.setLayoutY(10);        
        
        panel2.setLayoutX(120);
        panel2.setLayoutY(50);
        
        panel3.setLayoutX(120);
        panel3.setLayoutY(90);
        
        panel4.setLayoutX(120);
        panel4.setLayoutY(130);
        
        panel5.setLayoutX(120);
        panel5.setLayoutY(170);
        
        panel6.setLayoutX(120);
        panel6.setLayoutY(210);
        
        panel7.setLayoutX(210);
        panel7.setLayoutY(250);
           
        root.getChildren().addAll(panel1,panel2, panel3, panel4, panel5, panel6, panel7);
        
        Scene scene = new Scene(root, 520, 290);
        
        primaryStage.setTitle("Register");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
}
