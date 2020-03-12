import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.ToolBar;

/**
 * Write a description of JavaFX class MainPane here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainPane extends Application
{
    BorderPane pane = new BorderPane();
    Scene scene = new Scene(pane, 1000,800);
    
    public void define(){
        
        pane.setMinSize(400, 700);
        
  
        // Create a Button or any control item
        ToolBar toolBar = new ToolBar();
        toolBar.setPrefHeight(50);
        toolBar.setPrefWidth(700);
        
        HBox toolBox = new HBox();
        
        toolBox.setSpacing(pane.getWidth()-119);
        
        Button arrowLeft = new Button("<<<");
        Button arrowRight = new Button(">>>");
        
        toolBox.getChildren().add(arrowLeft);
        toolBox.getChildren().add(arrowRight);
    
        toolBar.getItems().add(toolBox);

        pane.setBottom(toolBar);
        
    }
    
    /**
     * The start method is the main entry point for every JavaFX application. 
     * It is called after the init() method has returned and after 
     * the system is ready for the application to begin running.
     *
     * @param  stage the primary stage for this application.
     */
    @Override
    public void start(Stage stage)
    {

        
      

        // JavaFX must have a Scene (window content) inside a Stage (window)
        
        stage.setTitle("JavaFX Example");
        stage.setScene(scene);

        System.out.println(pane.getWidth());
        // Show the Stage (window)
        stage.show();
    }
}
