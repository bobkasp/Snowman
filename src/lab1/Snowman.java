/* Snowman.java
 * program to extend for CSC-1024 Lab 1.
 * You will add statements to draw shapes representing a snowman.

 * adapted from Listing 1.2 from Java, by Savitch.
 * a sample JavaFX application that draws shapes on a canvas.
 * @author rkasper
 * Date: August 2021
 */

package lab1;
import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;
import javafx.scene.paint.Color; // added to change color

// the default name for the main class of a JavaFX application is App
public class Snowman extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }

   @Override
   public void start(Stage primaryStage)
   {
        Group root = new Group();
        Scene scene = new Scene(root);

        Canvas canvas = new Canvas(800, 600); // size of drawing area
        GraphicsContext gc = canvas.getGraphicsContext2D();
        // draw face outline
        gc.strokeOval(350, 100, 100, 100);
        
        // draw eyes
        // TO DO: change eye color to blue
        gc.setFill(Color.BROWN);
	    gc.fillOval(370, 125, 10, 20);
	    gc.fillOval(420, 125, 10, 20);
        // draw mouth
        // TO DO: change mouth color to red
	    gc.strokeArc(375, 155, 50, 25, 180, 180, ArcType.OPEN);

       // TO DO: draw middle snowball

       // TO DO: draw bottom snowball

       // TO DO: draw top hat
       // use a rectangle centered over head with a line for brim of hat

        root.getChildren().add(canvas);
        primaryStage.setTitle("Snowman in JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
   }
}
