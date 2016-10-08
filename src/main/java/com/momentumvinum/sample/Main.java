package com.momentumvinum.sample;

import com.momentumvinum.beans.Producto;
import com.momentumvinum.service.ServiceProducto;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);

        Producto producto = new Producto();
        producto.setId(1);
        producto.setNombre("Producto de prueba");
        producto.setTipo("Tinto");

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        ServiceProducto sp = (ServiceProducto)applicationContext.getBean("serviceProductoImpl");

        try{
            sp.registrar(producto);
        }catch (Exception e){
            System.out.println("YEPAAA");
        }
    }
}
