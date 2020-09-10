package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class Main extends Application {
    String Value;
   private Label viewL;
   private Button clearbtn,squareBtn,sqrtBtn,dividBtn,multiplyBtn,minusBtn,plusBtn,equalBtn,fullStopBtn,zeroBtn,pluMinusBtn,sevenBtn,eightBtn,nineBtn,fourBtn,fiveBtn,sixBtn,oneBtn,twoBtn,threeBtn;
   private HBox viewHox,line1Hbox,line2Hbox,line3Hbox,line4Hbox,line5Hbox;
   private FlowPane root;
   int a;
   int b;
   double c;
    @Override
    public void start(Stage primaryStage) throws Exception{
        viewL=new Label("0");
        viewL.setPrefWidth(580);
        viewL.setPrefHeight(50);
        viewL.setStyle("-fx-font:30 Arial");

        Clear c= new Clear();
        clearbtn=new Button("C");
        clearbtn.setPrefWidth(120);
        clearbtn.setPrefHeight(60);
        clearbtn.setOnAction(c);

        Square squ=new Square();
        squareBtn=new Button("x^2");
        squareBtn.setPrefWidth(120);
        squareBtn.setPrefHeight(60);
        squareBtn.setOnAction(squ);

        sqrt sqr=new sqrt();
        sqrtBtn=new Button("sqrt");
        sqrtBtn.setPrefWidth(120);
        sqrtBtn.setPrefHeight(60);
        sqrtBtn.setOnAction(sqr);

        Divid di =new Divid();
        dividBtn=new Button("/");
        dividBtn.setPrefWidth(120);
        dividBtn.setPrefHeight(60);
        dividBtn.setOnAction(di);

        Seven se=new Seven();
        sevenBtn=new Button("7");
        sevenBtn.setPrefWidth(120);
        sevenBtn.setPrefHeight(60);
        sevenBtn.setOnAction(se);

        Eight ei=new Eight();
        eightBtn=new Button("8");
        eightBtn.setPrefWidth(120);
        eightBtn.setPrefHeight(60);
        eightBtn.setOnAction(ei);

        Nine ni=new Nine();
        nineBtn=new Button("9");
        nineBtn.setPrefWidth(120);
        nineBtn.setPrefHeight(60);
        nineBtn.setOnAction(ni);

        Multiply mul=new Multiply();
        multiplyBtn=new Button("x");
        multiplyBtn.setPrefWidth(120);
        multiplyBtn.setPrefHeight(60);
        multiplyBtn.setOnAction(mul);

        Four fo=new Four();
        fourBtn=new Button("4");
        fourBtn.setPrefWidth(120);
        fourBtn.setPrefHeight(60);
        fourBtn.setOnAction(fo);

        Five fi =new Five();
        fiveBtn=new Button("5");
        fiveBtn.setPrefWidth(120);
        fiveBtn.setPrefHeight(60);
        fiveBtn.setOnAction(fi);

        six si =new six();
        sixBtn=new Button("6");
        sixBtn.setPrefWidth(120);
        sixBtn.setPrefHeight(60);
        sixBtn.setOnAction(si);

        Minus mi =new Minus();
        minusBtn=new Button("-");
        minusBtn.setPrefWidth(120);
        minusBtn.setPrefHeight(60);
        minusBtn.setOnAction(mi);

        one on =new one();
        oneBtn=new Button("1");
        oneBtn.setPrefWidth(120);
        oneBtn.setPrefHeight(60);
        oneBtn.setOnAction(on);

        Two tw = new Two();
        twoBtn=new Button("2");
        twoBtn.setPrefWidth(120);
        twoBtn.setPrefHeight(60);
        twoBtn.setOnAction(tw);

        Three th= new Three();
        threeBtn=new Button("3");
        threeBtn.setPrefWidth(120);
        threeBtn.setPrefHeight(60);
        threeBtn.setOnAction(th);

        Plus pl =new Plus();
        plusBtn=new Button("+");
        plusBtn.setPrefWidth(120);
        plusBtn.setPrefHeight(60);
        plusBtn.setOnAction(pl);

        pluMinusBtn=new Button("+/-");
        pluMinusBtn.setPrefWidth(120);
        pluMinusBtn.setPrefHeight(60);

        zeroBtn=new Button("0");
        zeroBtn.setPrefWidth(120);
        zeroBtn.setPrefHeight(60);

        fullStopBtn=new Button(".");
        fullStopBtn.setPrefWidth(120);
        fullStopBtn.setPrefHeight(60);

        Equal eq = new Equal();
        equalBtn=new Button("=");
        equalBtn.setPrefWidth(120);
        equalBtn.setPrefHeight(60);
        equalBtn.setOnAction(eq);

        viewHox=new HBox(viewL);
        viewHox.setPadding(new Insets(30,0,0,0));
        line1Hbox=new HBox(clearbtn,squareBtn,sqrtBtn,dividBtn);
        line2Hbox=new HBox(sevenBtn,eightBtn,nineBtn,multiplyBtn);
        line3Hbox=new HBox(fourBtn,fiveBtn,sixBtn,minusBtn);
        line4Hbox=new HBox(oneBtn,twoBtn,threeBtn,plusBtn);
        line5Hbox=new HBox(pluMinusBtn,zeroBtn,fullStopBtn,equalBtn);

        root=new FlowPane(viewHox,line1Hbox,line2Hbox,line3Hbox,line4Hbox,line5Hbox);
        root.setOrientation(Orientation.VERTICAL);
        Scene S=new Scene(root,480,380);


        primaryStage.setTitle("Calculator-181380043");
        primaryStage.setScene(S);
        primaryStage.show();
    }

    private class Clear implements EventHandler<ActionEvent>
    {

        @Override
        public void handle(ActionEvent event) {
            viewL.setText("0");
        }
    }
    private class Square implements EventHandler<ActionEvent>
    {

        @Override
        public void handle(ActionEvent event) {
            String a=viewL.getText().toString();
                int b=Integer.parseInt(a);
                int multipy=b*b;
            viewL.setText(Integer.toString(multipy));
        }
    }
    private class sqrt implements EventHandler<ActionEvent>
    {

        @Override
        public void handle(ActionEvent event) {
             a=Integer.parseInt(viewL.getText().toString());
            double b=Math.sqrt(a);
            viewL.setText(Double.toString(b));


        }
    }
    private class Nine implements EventHandler<ActionEvent>
    {

        @Override
        public void handle(ActionEvent event) {
             a=Integer.parseInt(viewL.getText().toString());
            viewL.setText(Integer.toString(9));


        }
    }
    private class Eight implements EventHandler<ActionEvent>
    {

        @Override
        public void handle(ActionEvent event) {
             a=Integer.parseInt(viewL.getText().toString());
            viewL.setText(Integer.toString(8));


        }
    }
    private class Seven implements EventHandler<ActionEvent>
    {

        @Override
        public void handle(ActionEvent event) {
             a=Integer.parseInt(viewL.getText().toString());
            viewL.setText(Integer.toString(7));


        }
    }
    private class six implements EventHandler<ActionEvent>
    {

        @Override
        public void handle(ActionEvent event) {
             a=Integer.parseInt(viewL.getText().toString());
            viewL.setText(Integer.toString(6));


        }
    }
    private class Five implements EventHandler<ActionEvent>
    {

        @Override
        public void handle(ActionEvent event) {
             a=Integer.parseInt(viewL.getText().toString());
            viewL.setText(Integer.toString(5));


        }
    }
    private class Four implements EventHandler<ActionEvent>
    {

        @Override
        public void handle(ActionEvent event) {
             a=Integer.parseInt(viewL.getText().toString());
            viewL.setText(Integer.toString(4));


        }
    }
    private class one implements EventHandler<ActionEvent>
    {

        @Override
        public void handle(ActionEvent event) {
             a=Integer.parseInt(viewL.getText().toString());
            viewL.setText(Integer.toString(1));


        }
    }
    private class Two implements EventHandler<ActionEvent>
    {

        @Override
        public void handle(ActionEvent event) {
             a=Integer.parseInt(viewL.getText().toString());
            viewL.setText(Integer.toString(2));


        }
    }
    private class Three implements EventHandler<ActionEvent>
    {

        @Override
        public void handle(ActionEvent event) {
             a=Integer.parseInt(viewL.getText().toString());
            viewL.setText(Integer.toString(3));


        }
    }
    private class Zero implements EventHandler<ActionEvent>
    {

        @Override
        public void handle(ActionEvent event) {
             a=Integer.parseInt(viewL.getText().toString());
            viewL.setText(Integer.toString(0));


        }
    }
    private class Divid implements EventHandler<ActionEvent>
    {

        @Override
        public void handle(ActionEvent event) {

             a=Integer.parseInt(viewL.getText().toString());
            Value="divid";

        }
    }
    private class Multiply implements EventHandler<ActionEvent>
    {

        @Override
        public void handle(ActionEvent event) {

             a =Integer.parseInt(viewL.getText().toString());
            Value="multiply";

        }
    }
    private class Plus implements EventHandler<ActionEvent>
    {

        @Override
        public void handle(ActionEvent event) {

             a=Integer.parseInt(viewL.getText().toString());
            Value="plus";

        }
    }
    private class Minus implements EventHandler<ActionEvent>
    {

        @Override
        public void handle(ActionEvent event) {

             a=Integer.parseInt(viewL.getText().toString());
            Value="minus";

        }
    }
    private class Equal implements EventHandler<ActionEvent>
    {


        @Override
        public void handle(ActionEvent event) {
            if(Value.equals("divid")){
                 c=Double.parseDouble(viewL.getText().toString());
                String n=a/c+ "";
                if(n.equalsIgnoreCase("Infinity")){
                    viewL.setText("Error");
                }
                else
                    viewL.setText(n);

            }
            else if(Value.equals("multiply")){
                b=Integer.parseInt(viewL.getText().toString());
                viewL.setText(Integer.toString(a*b));

            }
            else if(Value.equals("minus")){
                b=Integer.parseInt(viewL.getText().toString());
                viewL.setText(Integer.toString(a-b));
            }
            else if(Value.equals("plus")){
                b=Integer.parseInt(viewL.getText().toString());
                viewL.setText(Integer.toString(a+b));
            }



        }
    }



    public static void main(String[] args) {
        launch(args);
    }
}
