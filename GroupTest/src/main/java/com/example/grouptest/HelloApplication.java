package com.example.grouptest;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application
{
    @Override
    public void start(Stage stage) throws IOException
    {
        try
        {

            HelloApplication.Page(stage,"Attendence List","/Attendence.fxml",600,400);


        } catch (Exception e)
        {
            System.out.println(e);
            throw new RuntimeException(e);
        }

    }

    public static void Page(Stage stage,String title,String FXML,int v,int v1)throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(FXML));
        Scene scene = new Scene(fxmlLoader.load(),v,v1);
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)
    {
        launch();
    }

}