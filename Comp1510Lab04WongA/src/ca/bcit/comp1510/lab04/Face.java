/**
 * 
 */

package ca.bcit.comp1510.lab04;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Circle;

/**
 * Draw face.
 * 
 * @author Wong Alex a.wong555@bcit.ca.
 * @version Feb 11.2021
 */
public class Face extends Application {

    /**
     * making faces.
     * 
     */
    public Face() {
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Ellipse hair = new Ellipse(250, 120, 150, 220);
        hair.setFill(Color.BLACK);

        Ellipse face = new Ellipse(250, 250, 110, 110);
        face.setFill(Color.PEACHPUFF);

        Circle eyeL = new Circle(200, 220, 15);
        Circle eyeR = new Circle(290, 220, 15);
        Group eyes = new Group(eyeL, eyeR);

        Polygon nose = new Polygon(220, 245, 220, 275, 250, 280);

        Ellipse mouthTop = new Ellipse(250, 300, 80, 40);
        Ellipse mouthBottom = new Ellipse(250, 290, 80, 35);

        mouthBottom.setFill(Color.PEACHPUFF);
        Group month = new Group(mouthTop, mouthBottom);

        Group together = new Group(hair, face, eyes, month, nose);

        Scene scene = new Scene(together, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * drives program.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);
    }

}
