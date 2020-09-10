package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Main extends Application {
    Label headingL,dateL,marksL;
    DatePicker DateDP;
    TextField marksTF;
    Button SaveData;
    HBox headingHbox,mainHbox,buttonHbox;
    VBox labelVbox,textFieldVbox;
    FlowPane root;


    @Override
    public void start(Stage primaryStage) throws Exception{
        headingL=new Label("My CP Tracker");
        headingL.setStyle("-fx-font:22 Arial");
        dateL=new Label("Date");
        marksL=new Label("Marks");
        DateDP=new DatePicker();
        marksTF=new TextField();
        marksTF.setPromptText("Enter your Marks");
        SaveData=new Button("Save Data");
        SaveData.setOnAction(e-> save());
        headingHbox=new HBox(headingL);
        headingHbox.setAlignment(Pos.CENTER);
        headingHbox.setPadding(new Insets(30,50,10,10));
        labelVbox=new VBox(30,dateL,marksL);
        labelVbox.setPadding(new Insets(10,10,10,60));
        textFieldVbox=new VBox(20,DateDP,marksTF);
        textFieldVbox.setPadding(new Insets(10,60,10,10));
        mainHbox=new HBox(10,labelVbox,textFieldVbox);
        buttonHbox=new HBox(SaveData);
        buttonHbox.setPadding(new Insets(10,60,10,230));
        root=new FlowPane(headingHbox,mainHbox,buttonHbox);
        root.setOrientation(Orientation.VERTICAL);
        Scene s=new Scene(root,350,250);
        primaryStage.setScene(s);
        primaryStage.setTitle("181380043 CP Tracker");
        primaryStage.show();





    }
    private void save(){
        try(PrintWriter writer=new PrintWriter(new FileWriter("cp.txt",true))){
            String value="------- CP Marks on "+DateDP.getValue().toString()+" --------\n";
            value+=" Marks: "+marksTF.getText();
            writer.println(value);
            alert(value);
        }catch(Exception invalid){
            System.out.println("Error: "+invalid.getMessage());
        }
    }

    private void alert(String value){
        Alert a=new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("CP Data Saved");
        a.setHeaderText("Your CP data is saved successfully");
        a.setContentText(value);
        a.showAndWait();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
