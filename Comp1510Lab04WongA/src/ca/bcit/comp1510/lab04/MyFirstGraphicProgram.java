/**
 * 
 */

package ca.bcit.comp1510.lab04;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

/**
 * first program.
 * 
 * @author Wong Alex a.wong555@bcit.ca.
 * @version Feb 11.2021
 */

public class MyFirstGraphicProgram extends Application {

    /**
     * Stage setup.
     * 
     * @param primaryStage stage
     */
    public void start(Stage primaryStage) throws Exception {

        final int circleX = 250;
        final int circleY = 250;
        final int circleR = 135;

        final int nameX = 240;
        final int nameY = 250;

        // scene size 500 x 500 pixels
        final int sceneX = 500;
        final int sceneY = 500;

        Circle circle = new Circle(circleX, circleY, circleR);
        circle.setFill(Color.GREEN);

        Text myName = new Text(nameX, nameY, "Alex");
        myName.setFill(Color.WHITE);

        Group group = new Group(circle, myName);
        Scene scene = new Scene(group, sceneX, sceneY);

        primaryStage.setTitle("My first JavaFX program");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    /**
     * Drives the program.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);

    }

}
